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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.nms.mediation.corba.provider.NetworkElementProvider;

/**
 * EventHandler abstract class that provides all implementation logic related
 * with CORBA connection within NetworkElements.
 * 
 * By extending this class, it will provide access to required Remote Objects
 * through getRemoteObject method. All specific CORBA initialization and
 * configuration is being done on its init method, which uses specific utility
 * classes to connect to nodes.
 * 
 * Server ip address should be provided by clients as configuration (defined in
 * flow xml and available in EventHandlerContext configuration).
 * 
 * @author ewelche
 * 
 */
public abstract class AbstractCorbaHandler {

    protected static final String ADDRESS = "ipAddress";

    protected static final String SECURED = "secured";

    protected NetworkElementProviderFactory elementInterfaceProviderFactory = null;

    protected NetworkElementProvider elementInterfaceProvider = null;

    protected Logger log = LoggerFactory.getLogger(getClass());

    protected void initCorba(final String address, final Boolean secured) {

        this.elementInterfaceProvider = this.elementInterfaceProviderFactory.getNetworkElementInterfaceProvider();
        this.elementInterfaceProvider.init(address, secured);
    }
}
