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
package com.ericsson.nms.mediation.corbahandler.api;

import com.ericsson.nms.mediation.corba.provider.CorbaMociException;
import com.ericsson.nms.mediation.corba.provider.NetworkElementMOCIProvider;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.Session;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtended;
import com.ericsson.oss.itpf.common.event.handler.EventHandlerContext;

/**
 * 
 * Corba handler extension specialized on returning MOCI interfaces. It provides
 * simple methods to obtain references for MOCI remote objects, such as Session.
 * 
 * @author ewelche
 * 
 */
public abstract class AbstractCorbaMOCIHandler extends AbstractCorbaHandlerFlow {

    /**
     * Creates a MOCI Session remote object.
     * 
     * @return
     */
    protected Session createMOCISession(final String name, final int timeout, final boolean readOnly) throws CorbaMociException {
        return ((NetworkElementMOCIProvider) this.elementInterfaceProvider).createSession(getMociConfig(), name, timeout, readOnly);
    }

    private ConfigurationExtended getMociConfigObject(final String address, final boolean secured) throws CorbaMociException {

        return ((NetworkElementMOCIProvider) this.elementInterfaceProvider).getConfiguration(address, secured);
    }

    protected ConfigurationExtended getMociConfig() throws CorbaMociException {

        return (getMociConfigObject(address.get(), secured.get()));
    }

    @Override
    protected void resetProvider() {
        if (this.address == null) {
            throw new IllegalStateException("Handler has not been properly initialized. Missing \"address\" property.");
        }

        ((NetworkElementMOCIProvider) this.elementInterfaceProvider).removeConfiguration(address.get());
    }

    @Override
    public void init(final EventHandlerContext context) {
        super.elementInterfaceProviderFactory = new NetworkElementMOCIProviderFactory();
        super.init(context);
        doInit();
    }

}
