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
package com.ericsson.nms.mediation.corba.provider.visibroker.moci;

import static org.mockito.Matchers.any;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAManager;
import org.omg.PortableServer.Servant;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ericsson.nms.mediation.corba.provider.CorbaMociException;
import com.ericsson.nms.mediation.corba.provider.utils.HttpIORClient;
import com.ericsson.nms.mediation.corba.provider.utils.RequestFailedException;
import com.ericsson.nms.mediation.corba.provider.visibroker.common.VisibrokerProvider;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.ORBProvider;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.protocol.IPV4Strategy;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.protocol.IPV6Strategy;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.security.SecureStrategy;
import com.ericsson.nms.mediation.corba.provider.visibroker.orb.security.UnsecureStrategy;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.ProcessingFailure;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.BasicConfig.Session;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtended;
import com.ericsson.nms.umts.ranos.cms.nead.segmentserver.neaccess.cello_p1.idl.ConfigExtended.ConfigurationExtendedHelper;

/**
 * 
 * @author ealbeor class which provides unit tests for VisiBroker MOCI provider
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ VisibrokerProvider.class, VisibrokerMociProvider.class, NamingContextHelper.class, ConfigurationExtendedHelper.class })
public class VisibrokerMociProviderTest {

    @Mock
    private ORB orbMock;

    @Mock
    private ORBProvider orbV4Unsecure;

    @Mock
    private ORBProvider orbV4Secure;

    @Mock
    private ORBProvider orbV6Unsecure;

    @Mock
    private ORBProvider orbV6Secure;

    @Mock
    private HttpIORClient httpIorClientMock;

    @Mock
    private ConfigurationExtended configurationExtendedMock;

    @Mock
    private NamingContext namingContextMock;
    
    @Mock
    private Session sessionMock;
    
    @Mock
    private Servant servantMock;
    
    @Mock
    private POA poaMock;
    
    @Mock
    private POAManager poaManager;

    private String address = "localhost";

    private String addressV6 = "[2607:f0d0:1002:51::4]";

    private VisibrokerMociProvider toTest;

    private String sessionName = "session";

    private int timeout = 10000;

    @Before
    public void start() throws Exception {

        MockitoAnnotations.initMocks(this);
        PowerMockito.whenNew(ORBProvider.class).withArguments(IPV4Strategy.INSTANCE, UnsecureStrategy.INSTANCE).thenReturn(orbV4Unsecure);
        PowerMockito.whenNew(ORBProvider.class).withArguments(IPV4Strategy.INSTANCE, SecureStrategy.INSTANCE).thenReturn(orbV4Secure);
        PowerMockito.whenNew(ORBProvider.class).withArguments(IPV6Strategy.INSTANCE, UnsecureStrategy.INSTANCE).thenReturn(orbV6Unsecure);
        PowerMockito.whenNew(ORBProvider.class).withArguments(IPV6Strategy.INSTANCE, SecureStrategy.INSTANCE).thenReturn(orbV6Secure);
        PowerMockito.whenNew(HttpIORClient.class).withNoArguments().thenReturn(httpIorClientMock);
        //this is needed because VisiBroker instance is created only once in the overall test execution...
        VisibrokerProvider.VISIBROKER.restartORBProviders();
        toTest = new VisibrokerMociProvider();
    }

    @Test
    public void testInitSuccess() {

        Mockito.doReturn(orbMock).when(orbV4Unsecure).getORB();
        toTest.init(address, false);
        Mockito.verifyZeroInteractions(orbV4Secure, orbV6Unsecure, orbV6Secure);
        Assert.assertEquals(orbMock, VisibrokerProvider.VISIBROKER.getORB(address, false));
    }

    private void stubConfigObjectFirstCreation(final String address, final ORBProvider orbProvider) {

        final String ior = "kkkdvk";
        PowerMockito.mockStatic(NamingContextHelper.class);
        PowerMockito.mockStatic(ConfigurationExtendedHelper.class);
        Mockito.doReturn(orbMock).when(orbProvider).getORB();
        Mockito.doReturn(ior).when(httpIorClientMock).getIOR(address);
        final Object nameObject = Mockito.mock(Object.class);
        Mockito.doReturn(nameObject).when(orbMock).string_to_object(ior);
        Mockito.when(NamingContextHelper.narrow(nameObject)).thenReturn(namingContextMock);
    }

    private void stubConfigObjectCreationSuccesful() throws Exception {

        final Object configObject = Mockito.mock(Object.class);
        Mockito.doReturn(configObject).when(namingContextMock).resolve(VisibrokerMociProvider.configurationNamingPath);
        Mockito.when(ConfigurationExtendedHelper.unchecked_narrow(configObject)).thenReturn(configurationExtendedMock);
    }

    private void stubConfigObjectCreationWithException() throws Exception {

        Mockito.doThrow(new CannotProceed()).when(namingContextMock).resolve(VisibrokerMociProvider.configurationNamingPath);
    }

    @Test
    public void testGetConfigurationSuccess() throws Exception {

        stubConfigObjectFirstCreation(addressV6, orbV6Unsecure);
        stubConfigObjectCreationSuccesful();
        Assert.assertEquals(configurationExtendedMock, toTest.getConfiguration(addressV6, false));
        Assert.assertEquals(configurationExtendedMock, toTest.getConfiguration(addressV6, true));
        Mockito.verifyZeroInteractions(orbV4Secure, orbV4Unsecure, orbV6Secure);
    }

    @Test(expected = CorbaMociException.class)
    public void testGetConfigurationFailed() throws Exception {

        stubConfigObjectFirstCreation(addressV6, orbV6Secure);
        stubConfigObjectCreationWithException();
        toTest.getConfiguration(addressV6, true);
        Mockito.verifyZeroInteractions(orbV4Secure, orbV4Unsecure, orbV6Unsecure);
    }

    @Test(expected = RequestFailedException.class)
    public void testHTTPFailure() throws Exception {

        Mockito.doReturn(orbMock).when(orbV4Secure).getORB();
        Mockito.doThrow(new RequestFailedException()).when(httpIorClientMock).getIOR(address);
        toTest.getConfiguration(address, true);
        Mockito.verifyZeroInteractions(orbV6Secure, orbV4Unsecure, orbV6Unsecure);
    }

    @Test
    public void testCreateSessionOKWithReadOnly() throws Exception {

        Mockito.doReturn(sessionMock).when(configurationExtendedMock).create_session(sessionName, timeout);
        toTest.createSession(configurationExtendedMock, sessionName, timeout, true);
        Mockito.verify(sessionMock).rollback();
    }

    @Test
    public void testCreateSessionOKNoReadOnly() throws Exception {

        Mockito.doReturn(sessionMock).when(configurationExtendedMock).create_session(sessionName, timeout);
        toTest.createSession(configurationExtendedMock, sessionName, timeout, false);
        Mockito.verify(sessionMock, Mockito.times(0)).rollback();
    }

    @Test(expected = CorbaMociException.class)
    public void testCreateSessionFailed() throws Exception {

        Mockito.doThrow(new ProcessingFailure()).when(configurationExtendedMock).create_session(sessionName, timeout);
        toTest.createSession(configurationExtendedMock, sessionName, timeout, false);
    }
    
    @Test
    public void testresolveSuccess() throws Exception {
    	Mockito.doReturn(poaMock).when(orbMock).resolve_initial_references(any(String.class));
    	Mockito.doReturn(poaManager).when(poaMock).the_POAManager();
    	Mockito.doNothing().when(poaManager).activate();
    	stubConfigObjectFirstCreation(addressV6, orbV6Unsecure);
        stubConfigObjectCreationSuccesful();
        Assert.assertEquals(poaMock, toTest.resolve(addressV6, false, servantMock));
    }
    
    @Test(expected = CorbaMociException.class)
    public void testresolveFailedWithInvalidPOAName() throws Exception {
    	Mockito.doThrow(new InvalidName()).when(orbMock).resolve_initial_references(any(String.class));
    	Mockito.doReturn(poaManager).when(poaMock).the_POAManager();
    	Mockito.doNothing().when(poaManager).activate();
    	stubConfigObjectFirstCreation(addressV6, orbV6Unsecure);
        stubConfigObjectCreationSuccesful();
        toTest.getConfiguration(addressV6, false);
        toTest.resolve(addressV6, false, servantMock);
    }
    
    @Test(expected = CorbaMociException.class)
    public void testresolveFailedToActivatePOA() throws Exception {
    	Mockito.doReturn(poaMock).when(orbMock).resolve_initial_references(any(String.class));
    	Mockito.doReturn(poaManager).when(poaMock).the_POAManager();
    	Mockito.doThrow(new AdapterInactive()).when(poaManager).activate();
    	stubConfigObjectFirstCreation(addressV6, orbV6Unsecure);
        stubConfigObjectCreationSuccesful();
        toTest.getConfiguration(addressV6, false);
        toTest.resolve(addressV6, false, servantMock);
    }

}
