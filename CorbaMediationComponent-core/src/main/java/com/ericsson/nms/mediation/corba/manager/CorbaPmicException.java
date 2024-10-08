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
package com.ericsson.nms.mediation.corba.manager;

@SuppressWarnings("serial")
public class CorbaPmicException extends Exception {

    public CorbaPmicException() {
    }

    public CorbaPmicException(final String message) {
        super(message);

    }

    public CorbaPmicException(final Throwable cause) {
        super(cause);

    }

    public CorbaPmicException(final String message, final Throwable cause) {
        super(message, cause);

    }

    public CorbaPmicException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);

    }
}
