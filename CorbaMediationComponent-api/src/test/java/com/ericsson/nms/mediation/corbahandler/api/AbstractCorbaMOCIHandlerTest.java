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

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ericsson.nms.mediation.corba.provider.NetworkElementMOCIProvider;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtended;
import com.ericsson.oss.itpf.common.config.Configuration;
import com.ericsson.oss.itpf.common.event.handler.EventHandlerContext;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ AbstractCorbaMOCIHandler.class, AbstractCorbaHandler.class })
public class AbstractCorbaMOCIHandlerTest {

    private class TestCorbaMOCIHandler extends AbstractCorbaMOCIHandler {

        public TestCorbaMOCIHandler() {
            super();
            this.secured.set(secure);
        }

        @Override
        public void onEvent(final Object inputEvent) {
            // TODO Auto-generated method stub

        }

        @Override
        protected void doInit() {

        }
    }

    private AbstractCorbaMOCIHandler testHandler = new TestCorbaMOCIHandler();

    private boolean secure = false;
    private ConfigurationExtended mockedMOCIConfig;
    private NetworkElementMOCIProvider mockedProvider;
    private NetworkElementMOCIProviderFactory mockedFactory;
    private Configuration mockedHandlerConfiguration;
    private EventHandlerContext mockedContext;

    @Before
    public void start() {
        mockedMOCIConfig = mock(ConfigurationExtended.class);
        mockedProvider = mock(NetworkElementMOCIProvider.class);
        mockedFactory = mock(NetworkElementMOCIProviderFactory.class);
        mockedHandlerConfiguration = mock(Configuration.class);
        mockedContext = mock(EventHandlerContext.class);
    }

    /**
     * Passes a EventHandlerContext with no address configuration and checks if
     * it returns IllegalArgumentException.
     */
    @Test
    public void test_init_throws_IllegalArgumentException_no_address() throws Exception {
        when(mockedProvider.getConfiguration("localhost", secure)).thenReturn(mockedMOCIConfig);
        PowerMockito.whenNew(NetworkElementMOCIProviderFactory.class).withNoArguments().thenReturn(mockedFactory);
        when(mockedFactory.getNetworkElementInterfaceProvider()).thenReturn(mockedProvider);
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.ADDRESS)).thenReturn(null);
        when(mockedContext.getEventHandlerConfiguration()).thenReturn(mockedHandlerConfiguration);
        try {
            this.testHandler.init(mockedContext);
            fail("Should had thrown IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    /**
     * Simulates a perfect condition scenario. It mocks EventHandlerContext to
     * return an address different from null, as well as NetworkElementProvider
     * and NetworkElementProviderFactory to emulate successful invocation of
     * init() method in NetworkElementProvider implementation.
     * 
     */
    @Test
    public void test_init_success() throws Exception {
        when(mockedProvider.getConfiguration("localhost", secure)).thenReturn(mockedMOCIConfig);
        when(mockedFactory.getNetworkElementInterfaceProvider()).thenReturn(mockedProvider);
        PowerMockito.whenNew(NetworkElementMOCIProviderFactory.class).withNoArguments().thenReturn(mockedFactory);
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.ADDRESS)).thenReturn("localhost");
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.SECURED)).thenReturn(Boolean.toString(secure));
        when(mockedContext.getEventHandlerConfiguration()).thenReturn(mockedHandlerConfiguration);
        this.testHandler.init(mockedContext);
        verify(mockedProvider).init("localhost", secure);
    }

    /**
     * Simulates a perfect condition scenario. It mocks EventHandlerContext to
     * return an address different from null, as well as NetworkElementProvider
     * and NetworkElementProviderFactory to emulate successful invocation of
     * init(), getConfiguration() and createSession() methods in
     * NetworkElementProvider implementation.
     * 
     */
    @Test
    public void test_createMOCISession_success() throws Exception {
        when(mockedProvider.getConfiguration("localhost", secure)).thenReturn(mockedMOCIConfig);
        when(mockedFactory.getNetworkElementInterfaceProvider()).thenReturn(mockedProvider);
        PowerMockito.whenNew(NetworkElementMOCIProviderFactory.class).withNoArguments().thenReturn(mockedFactory);
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.ADDRESS)).thenReturn("localhost");
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.SECURED)).thenReturn(Boolean.toString(secure));
        when(mockedContext.getEventHandlerConfiguration()).thenReturn(mockedHandlerConfiguration);
        this.testHandler.init(mockedContext);
        verify(mockedProvider).init("localhost", secure);
        final String name = "session";
        final int timeout = 10;
        final boolean readOnly = true;
        this.testHandler.createMOCISession(name, timeout, readOnly);
        verify(mockedProvider).createSession(mockedMOCIConfig, name, timeout, readOnly);
    }

    /**
     * Simulates a perfect condition scenario. It mocks EventHandlerContext to
     * return an address different from null, as well as NetworkElementProvider
     * and NetworkElementProviderFactory to emulate successful invocation of
     * resetProvider() method in NetworkElementProvider implementation.
     * 
     */
    @Test
    public void test_resetProvider_success() throws Exception {
        when(mockedProvider.getConfiguration("localhost", secure)).thenReturn(mockedMOCIConfig);
        when(mockedFactory.getNetworkElementInterfaceProvider()).thenReturn(mockedProvider);
        PowerMockito.whenNew(NetworkElementMOCIProviderFactory.class).withNoArguments().thenReturn(mockedFactory);
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.ADDRESS)).thenReturn("localhost");
        when(mockedContext.getEventHandlerConfiguration()).thenReturn(mockedHandlerConfiguration);
        this.testHandler.init(mockedContext);
        this.testHandler.resetProvider();
        verify(mockedProvider).init("localhost", secure);
        verify(mockedProvider).removeConfiguration("localhost");
    }

    /**
     * Simulates getting MOCI configuration successfully. It mocks
     * EventHandlerContext to return an address different from null, as well as
     * NetworkElementProvider and NetworkElementProviderFactory to emulate
     * successful invocation of getMociConfig() method in NetworkElementProvider
     * implementation.
     * 
     */
    @Test
    public void test_getMociConfig_success() throws Exception {
        when(mockedFactory.getNetworkElementInterfaceProvider()).thenReturn(mockedProvider);
        this.testHandler.elementInterfaceProviderFactory = mockedFactory;
        this.testHandler.elementInterfaceProvider = mockedProvider;
        when(mockedProvider.getConfiguration("localhost", secure)).thenReturn(mockedMOCIConfig);
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.ADDRESS)).thenReturn("localhost");
        when(mockedHandlerConfiguration.getStringProperty(AbstractCorbaMOCIHandler.SECURED)).thenReturn(Boolean.toString(secure));
        when(mockedContext.getEventHandlerConfiguration()).thenReturn(mockedHandlerConfiguration);
        PowerMockito.whenNew(NetworkElementMOCIProviderFactory.class).withNoArguments().thenReturn(mockedFactory);
        testHandler.init(mockedContext);
        assertNotNull(testHandler.getMociConfig());
        verify(mockedProvider).getConfiguration("localhost", secure);
        assertEquals(mockedMOCIConfig, testHandler.getMociConfig());
    }

}
