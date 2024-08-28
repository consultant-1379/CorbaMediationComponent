/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.nms.mediation.corba.provider.visibroker.orb;

import java.util.Properties;

import org.omg.CORBA.Any;
import org.omg.CORBA.InvalidPolicies;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Policy;
import org.omg.CORBA.PolicyError;
import org.omg.CORBA.PolicyManager;
import org.omg.CORBA.PolicyManagerHelper;
import org.omg.CORBA.SetOverrideType;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.Messaging.REBIND_POLICY_TYPE;
import org.omg.Messaging.RebindModeHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.ericsson.security.corba.ORBInit;

import com.ericsson.nms.mediation.corba.provider.Constants;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.protocol.ProtocolStrategy;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.security.SecurityStrategy;
import com.inprise.vbroker.QoSExt.RELATIVE_CONN_TIMEOUT_POLICY_TYPE;

/**
 * 
 * @author ealbeor class which holds an ORB instance
 */
public class ORBProvider implements Constants {

    private static final String ORB_SINGLETON_VALUE = "com.inprise.vbroker.orb.ORBSingleton";

	private static final String ORB_SINGLETON_KEY = "org.omg.CORBA.ORBSingletonClass";

	private static final String ORB_CLASS_VALUE = "com.inprise.vbroker.orb.ORB";

	private static final String ORB_CLASS_KEY = "org.omg.CORBA.ORBClass";

	private SecurityStrategy securityStrategy;

    private ProtocolStrategy protocolStrategy;

    protected static Logger log = LoggerFactory.getLogger(ORBProvider.class);

    /**
     * @param strategy
     */
    public ORBProvider(final ProtocolStrategy protocolStrategy, final SecurityStrategy strategy) {
        super();
        this.protocolStrategy = protocolStrategy;
        this.securityStrategy = strategy;
    }

    private ORB orb;

    public ORB getORB() {

        if (orb == null) {
            orb = createORB();
        }
        return orb;
    }

    private ORB createORB() {

        final Properties properties = ORBInit.getOrbProperties(protocolStrategy.getComponentName());
        securityStrategy.fill(properties);
        protocolStrategy.fill(properties);
        fillfromSystemProperties(properties);
        
        log.trace("Properties for the ORB : {}", properties);
        final ORB orb = ORB.init(new String[0], properties);
        log.trace("ORB class instantiated {}", orb.getClass());
        setPolicies(orb);
        return orb;
    }

    private void setPolicies(final ORB orb) {

        final Any rebindPolicyValue = orb.create_any();
        final Any timeoutPolicyValue = orb.create_any();

        RebindModeHelper.insert(rebindPolicyValue, org.omg.Messaging.NO_RECONNECT.value);
        timeoutPolicyValue.insert_ulonglong(ORB_TIMEOUT * 10000);

        //get a reference to the ORB policy manager
        try {
            final Policy rebindPolicy = orb.create_policy(REBIND_POLICY_TYPE.value, rebindPolicyValue);
            final Policy timeoutPolicy = orb.create_policy(RELATIVE_CONN_TIMEOUT_POLICY_TYPE.value, timeoutPolicyValue);
            final PolicyManager manager = PolicyManagerHelper.narrow(orb.resolve_initial_references("ORBPolicyManager"));
            manager.set_policy_overrides(new Policy[] { rebindPolicy, timeoutPolicy }, SetOverrideType.SET_OVERRIDE);
        } catch (final PolicyError e) {
            log.error("Error overriding ORB policies: {}", e.getMessage());
            log.debug("Full exception trace: ", e);
        } catch (final InvalidName e) {
            log.error("Invalid policy name: {}", e.getMessage());
            log.debug("Full exception trace: ", e);
        } catch (final InvalidPolicies e) {
            log.error("Invalid policy: {}", e.getMessage());
            log.debug("Full exception trace: ", e);
        }

    }

    private void fillfromSystemProperties(final Properties properties) {

        for (final java.lang.Object keyObject : System.getProperties().keySet()) {
            final String key = (String) keyObject;
            if (key.startsWith("vbroker.") || key.contains("ORB")) {
                properties.setProperty(key, System.getProperty(key));
            }
        }
        properties.setProperty(ORB_CLASS_KEY, ORB_CLASS_VALUE);
        properties.setProperty(ORB_SINGLETON_KEY, ORB_SINGLETON_VALUE);
    }

}
