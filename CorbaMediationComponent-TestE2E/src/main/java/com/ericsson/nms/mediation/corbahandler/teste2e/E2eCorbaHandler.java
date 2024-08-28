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

import static org.junit.Assert.assertNotNull;

import com.ericsson.nms.mediation.corba.provider.CorbaMociException;
import com.ericsson.nms.mediation.corbahandler.api.AbstractCorbaMOCIHandler;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.Session;

public class E2eCorbaHandler extends AbstractCorbaMOCIHandler {

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.ericsson.oss.itpf.common.event.handler.AbstractEventHandler#doInit()
     */
    @Override
    protected void doInit() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.ericsson.oss.itpf.common.event.handler.EventInputHandler#onEvent(
     * java.lang.Object)
     */
    @Override
    public void onEvent(final Object inputEvent) {
        try {
            final Session mociSession = this.createMOCISession("session", 10, true);
            assertNotNull(mociSession);
        } catch (final CorbaMociException e) {
            log.error("Got exception when creating session: {}", e.getMessage());
        }
    }

}
