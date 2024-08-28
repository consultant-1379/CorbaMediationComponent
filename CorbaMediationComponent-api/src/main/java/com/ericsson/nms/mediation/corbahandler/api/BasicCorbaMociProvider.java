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
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtended;

/**
 * 
 * @author ealbeor class provided to use AbstractMociHandler facilities without
 *         extending it
 */
public class BasicCorbaMociProvider extends AbstractCorbaHandler {

    public BasicCorbaMociProvider() {
    }

    public ConfigurationExtended getMociConfig(final String address, final boolean secured) throws CorbaMociException {

        if (super.elementInterfaceProviderFactory == null) {
            super.elementInterfaceProviderFactory = new NetworkElementMOCIProviderFactory();
            initCorba(address, secured);
        }
        return ((NetworkElementMOCIProvider) super.elementInterfaceProvider).getConfiguration(address, secured);
    }

    public void resetProvider(final String address) {

        ((NetworkElementMOCIProvider) super.elementInterfaceProvider).removeConfiguration(address);
    }

}
