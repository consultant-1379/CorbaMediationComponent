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

import static org.mockito.Mockito.*;

import org.junit.Test;
import com.ericsson.nms.mediation.corba.provider.NetworkElementProvider;
import com.ericsson.oss.itpf.common.config.Configuration;
import com.ericsson.oss.itpf.common.event.handler.EventHandlerContext;

public class AbstractCorbalHandlerTest {

    private class TestCorbalHandler extends AbstractCorbaHandlerFlow {

        /* (non-Javadoc)
         * @see com.ericsson.oss.itpf.common.event.handler.EventInputHandler#onEvent(java.lang.Object)
         */
        @Override
        public void onEvent(final Object inputEvent) {
            // TODO Auto-generated method stub

        }

        /* (non-Javadoc)
         * @see com.ericsson.nms.mediation.corbahandler.api.AbstractCorbaHandler#resetProvider()
         */
        @Override
        protected void resetProvider() {
            // TODO Auto-generated method stub

        }

        /* (non-Javadoc)
         * @see com.ericsson.oss.itpf.common.event.handler.AbstractEventHandler#doInit()
         */
        @Override
        protected void doInit() {
            // TODO Auto-generated method stub

        }

    }

    private AbstractCorbaHandlerFlow testHandler = new TestCorbalHandler();

    @Test(expected = IllegalArgumentException.class)
    public void test_init_throws_IllegalArgumentException_no_address() {

        final EventHandlerContext mockedContext = mock(EventHandlerContext.class);
        final Configuration mockedConfig = mock(Configuration.class);

        when(mockedContext.getEventHandlerConfiguration()).thenReturn(mockedConfig);
        when(mockedConfig.getStringProperty(AbstractCorbaHandler.ADDRESS)).thenReturn(null);

        testHandler.init(mockedContext);
    }

    @Test
    public void test_init_success() throws Exception {

        final EventHandlerContext mockedContext = mock(EventHandlerContext.class);
        final Configuration mockedConfig = mock(Configuration.class);
        final NetworkElementProvider mockedProvider = mock(NetworkElementProvider.class);
        final NetworkElementProviderFactory mockedFactory = mock(NetworkElementProviderFactory.class);

        when(mockedContext.getEventHandlerConfiguration()).thenReturn(mockedConfig);
        when(mockedConfig.getStringProperty(AbstractCorbaHandler.SECURED)).thenReturn("true");
        when(mockedConfig.getStringProperty(AbstractCorbaHandler.ADDRESS)).thenReturn("localhost");
        when(mockedFactory.getNetworkElementInterfaceProvider()).thenReturn(mockedProvider);

        testHandler.elementInterfaceProviderFactory = mockedFactory;

        testHandler.init(mockedContext);
        verify(mockedProvider).init("localhost", true);
    }

    @Test
    public void test_destroy() {
        final NetworkElementProvider mockedProvider = mock(NetworkElementProvider.class);
        testHandler.elementInterfaceProvider = mockedProvider;
        testHandler.destroy();
        verify(mockedProvider).destroy();
    }

}
