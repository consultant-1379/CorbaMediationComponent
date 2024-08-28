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
package com.ericsson.nms.mediation.corba.provider.visibroker.orb.security;

import java.util.Properties;

public enum UnsecureStrategy implements SecurityStrategy {

    INSTANCE;

    @Override
    public void fill(final Properties properties) {
        properties.setProperty("vbroker.security.disable", "true");
    }

}
