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
package com.ericsson.nms.mediation.corba.provider.visibroker.moci;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.Servant;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.nms.mediation.corba.provider.CorbaMociException;
import com.ericsson.nms.mediation.corba.provider.CorbaMociManager;
import com.ericsson.nms.mediation.corba.provider.NetworkElementMOCIProvider;
import com.ericsson.nms.mediation.corba.provider.utils.HttpIORClient;
import com.ericsson.nms.mediation.corba.provider.visibroker.common.VisibrokerProvider;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.ProcessingFailure;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.Session;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.TransactionFailure;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtended;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtendedHelper;

public class VisibrokerMociProvider extends CorbaMociManager implements NetworkElementMOCIProvider {

	private static final String VB_ROOT_POA = "VBRootPOA";

	private HttpIORClient iorClient;

    private VisibrokerProvider provider;

    static final NameComponent[] configurationNamingPath = { new NameComponent("CelloConfigurationService", "") };
    
    private static Logger log = LoggerFactory.getLogger(VisibrokerMociProvider.class);

    public VisibrokerMociProvider() {

        super();
        iorClient = new HttpIORClient();
        provider = VisibrokerProvider.VISIBROKER;
    }

    @Override
    public void destroy() {
        provider.destroy();
    }

    @Override
    public void init(final String elementAddress, final boolean secured) {
        provider.init(elementAddress, secured);
    }

    @Override
    public Session createSession(final ConfigurationExtended configuration, final String name, final int timeout, final boolean readOnly) throws CorbaMociException {

        try {
            final Session session = configuration.create_session(name, timeout);
            if (readOnly) {
                session.rollback();
            }
            return session;
        } catch (final ProcessingFailure e) {
            throw new CorbaMociException(e.getMessage(), e);
        } catch (final TransactionFailure e) {
            throw new CorbaMociException(e.getMessage(), e);
        }
    }

    @Override
    public ConfigurationExtended createConfigurationObject(final String elementAddress, final boolean secure) throws CorbaMociException {

        try {
            final ORB orb = provider.getORB(elementAddress, secure);
            final org.omg.CORBA.Object tempObj = orb.string_to_object(iorClient.getIOR(elementAddress));
            final NamingContext ncRoot = NamingContextHelper.narrow(tempObj);
            // Attempt to locate the CelloConfigurationService in the naming
            // context
            final org.omg.CORBA.Object obj = ncRoot.resolve(configurationNamingPath);
            final ConfigurationExtended configuration = ConfigurationExtendedHelper.unchecked_narrow(obj);
            return configuration;
        } catch (final NotFound e) {
            throw new CorbaMociException(e.getMessage(), e);
        } catch (final CannotProceed e) {
            throw new CorbaMociException(e.getMessage(), e);
        } catch (final InvalidName e) {
            throw new CorbaMociException(e.getMessage(), e);
        }
    }
    
    @Override
	public Object resolve(final String elementAddress, final boolean secure, Servant servant) throws CorbaMociException {
    	final ORB orb = provider.getORB(elementAddress, secure);
    	POA poa = null;
    	try {
    		log.trace("Resolving the POA");
    		
			poa = POAHelper.narrow(orb.resolve_initial_references(VB_ROOT_POA));
			poa.the_POAManager().activate();
			
			log.trace("POA is successfully resolved & activated");
		} catch (org.omg.CORBA.ORBPackage.InvalidName e) {
			throw new CorbaMociException(e.getMessage(), e);
		} catch (AdapterInactive e) {
			throw new CorbaMociException(e.getMessage(), e);
		}
		return poa;
    }

}
