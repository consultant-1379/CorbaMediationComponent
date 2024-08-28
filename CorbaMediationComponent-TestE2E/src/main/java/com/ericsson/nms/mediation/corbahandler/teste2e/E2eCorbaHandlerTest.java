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
package com.ericsson.nms.mediation.corbahandler.teste2e;

import org.junit.Test;
import org.junit.runner.JUnitCore;

/**
 * 
 * @author eizamas
 * 
 */

public class E2eCorbaHandlerTest {

    private final E2eCorbaHandler exampleCorbaHandler = new E2eCorbaHandler();

    @Test
    public void testCreatingSession_createSessionWithSingleNode_sessionSuccessfullyCreated() {
        final String ipAddress = System.getProperty("ipAddress");
        final E2eEventHandlerContext eventHandlerContext = new E2eEventHandlerContext(ipAddress);
        exampleCorbaHandler.init(eventHandlerContext);
        exampleCorbaHandler.onEvent(null);
    }

    public static void main(final String[] args) {
        JUnitCore.main("com.ericsson.nms.mediation.corbahandler.teste2e.E2eCorbaHandlerTest");
    }
}
