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
package com.ericsson.nms.mediation.corba.provider.visibroker.common;

import org.omg.CORBA.ORB;

import com.ericsson.nms.mediation.corba.provider.NetworkElementProvider;
import com.ericsson.nms.mediation.corba.provider.utils.InetAddressUtil;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.*;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.protocol.IPV4Strategy;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.protocol.IPV6Strategy;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.security.SecureStrategy;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.security.UnsecureStrategy;

/**
 * 
 * Visibroker implementation for NetworkElementInterfaceProvider.
 * 
 * Defined as enum to implement singleton pattern.
 * 
 * @author ewelche
 * 
 */
public enum VisibrokerProvider implements NetworkElementProvider {

    VISIBROKER;

    private ORBProvider orbV4Unsecure;

    private ORBProvider orbv6Unsecure;

    private ORBProvider orbV4Secure;

    private ORBProvider orbv6Secure;

    /**
	 * 
	 */
    private VisibrokerProvider() {
        restartORBProviders();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.ericsson.nms.mediation.corbahandler.api.NetworkElementInterfaceProvider
     * #destroy()
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    public ORB getORB(final String elementAddress, final boolean secured) {

        ORBProvider provider = null;
        if (secured) {
            provider = (InetAddressUtil.isVersion6(elementAddress)) ? orbv6Secure : orbV4Secure;
        } else {
            provider = (InetAddressUtil.isVersion6(elementAddress)) ? orbv6Unsecure : orbV4Unsecure;
        }
        return provider.getORB();
    }

    @Override
    public void init(final String elementAddress, final boolean secured) {

        getORB(elementAddress, secured);
    }

    /**
     * Needed to be able to execute consecutive tests (this is an enum and
     * providers are instanciated only when the class is loaded by the
     * classloader)
     */
    public void restartORBProviders() {

        orbV4Unsecure = new ORBProvider(IPV4Strategy.INSTANCE, UnsecureStrategy.INSTANCE);

        orbv6Unsecure = new ORBProvider(IPV6Strategy.INSTANCE, UnsecureStrategy.INSTANCE);

        orbV4Secure = new ORBProvider(IPV4Strategy.INSTANCE, SecureStrategy.INSTANCE);

        orbv6Secure = new ORBProvider(IPV6Strategy.INSTANCE, SecureStrategy.INSTANCE);
    }

}
