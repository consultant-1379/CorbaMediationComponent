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
package com.ericsson.nms.mediation.corba.provider.visibroker.orb.protocol;

import java.util.Properties;

public interface ProtocolStrategy {

    static final String IIOP_HOST_PROP_NAME = "vbroker.ce.iiop.host";

    String getComponentName();

    void fill(Properties properties);

}
