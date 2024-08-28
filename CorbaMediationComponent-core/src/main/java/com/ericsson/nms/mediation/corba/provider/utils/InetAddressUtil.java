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
package com.ericsson.nms.mediation.corba.provider.utils;

import java.net.*;

public class InetAddressUtil {

    /**
     * check if an IP address is V4 or V6
     * 
     * @param address
     *            address to check
     * @return if it is IPV4 or IPV6
     */
    public static boolean isVersion6(final String address) {

        try {
            final InetAddress inetAddress = InetAddress.getByName(address);
            if (inetAddress instanceof Inet6Address) {
                return true;
            }
        } catch (final UnknownHostException e) {
        }

        return false;
    }

}
