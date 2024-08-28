/*------------------------------------------------------------------------------
 *****************************************************ENUM**************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.nms.mediation.corba.provider.visibroker.orb.protocol;

import java.util.Properties;

import com.ericsson.nms.mediation.corba.provider.Constants;

public enum IPV6Strategy implements ProtocolStrategy, Constants {

    INSTANCE;

    protected static final String COMPONENT_NAME_SYSTEM_PROPERTY = "se.ericsson.security.componentNameV6";

    @Override
    public String getComponentName() {
        return System.getProperty(COMPONENT_NAME_SYSTEM_PROPERTY, IPV6_DEFAULT_VALUE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.ericsson.nms.mediation.corba.provider.visibroker.common.orb.ORBProvider
     * # fill(java.util.Properties)
     */
    @Override
    public void fill(final Properties properties) {

        properties.put(IIOP_HOST_PROP_NAME, System.getProperty(IPV6_PARAM_NAME, IPV6_DEFAULT_VALUE));
    }

}
