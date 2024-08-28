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

@SuppressWarnings("serial")
public class CorbaMociException extends Exception {

    /**
     * 
     */
    public CorbaMociException() {
    }

    /**
     * @param message
     */
    public CorbaMociException(final String message) {
        super(message);

    }

    /**
     * @param cause
     */
    public CorbaMociException(final Throwable cause) {
        super(cause);

    }

    /**
     * @param message
     * @param cause
     */
    public CorbaMociException(final String message, final Throwable cause) {
        super(message, cause);

    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public CorbaMociException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);

    }

}
