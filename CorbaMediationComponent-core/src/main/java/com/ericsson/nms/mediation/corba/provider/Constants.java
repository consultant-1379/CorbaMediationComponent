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
package com.ericsson.nms.mediation.corba.provider;

public interface Constants {

    static final String IPV4_PARAM_NAME = "corba.client.host.v4";
    static final String IPV6_PARAM_NAME = "corba.client.host.v6";
    static final String IPV4_DEFAULT_VALUE = "vip.v4";
    static final String IPV6_DEFAULT_VALUE = "vip.v6";

    static final int ORB_TIMEOUT = 60000;

}
