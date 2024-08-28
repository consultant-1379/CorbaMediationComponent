/**
 * 
 */
package com.ericsson.nms.mediation.corba.provider.utils.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ericsson.nms.mediation.corba.provider.utils.HttpIORClient;
import com.ericsson.nms.mediation.corba.provider.utils.RequestFailedException;

/**
 * @author edanicu
 * 
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(HttpIORClient.class)
public class HttpIORClientTest {
	
	private HttpClient mockedClient;
	private HttpIORClient testClient;
	private GetMethod mockedGet;
	
	private final String testIp = "test_IP";
	private final String testUrl = "http://" + testIp + ":80"
			+ "/cello/ior_files/nameroot.ior";

	@Before
	public void start() {
		mockedClient = mock(HttpClient.class);
		testClient = new HttpIORClient(mockedClient);
		mockedGet = mock(GetMethod.class);
	}

	@Test
	public void test_GetIOR_success() throws Exception {
		
		PowerMockito.whenNew(GetMethod.class).withArguments(testUrl)
				.thenReturn(mockedGet);
		when(mockedClient.executeMethod(mockedGet))
				.thenReturn(HttpStatus.SC_OK);
		when(mockedGet.getResponseBodyAsString()).thenReturn("Response Body");
		
		String iorResult = testClient.getIOR(testIp);
		verify(mockedGet).releaseConnection();

		assertEquals("Response Body", iorResult);
	}

	@Test(expected = RequestFailedException.class)
	public void test_GetIOR_failure() throws Exception {
		PowerMockito.whenNew(GetMethod.class).withArguments(testUrl)
				.thenReturn(mockedGet);
		when(mockedClient.executeMethod(mockedGet)).thenReturn(
				HttpStatus.SC_NOT_FOUND);

		testClient.getIOR(testIp);
	}

	@Test(expected = RequestFailedException.class)
	public void test_GetIOR_throws_IOException() throws Exception {
		PowerMockito.whenNew(GetMethod.class).withArguments(testUrl)
				.thenReturn(mockedGet);
		when(mockedClient.executeMethod(mockedGet))
				.thenReturn(HttpStatus.SC_OK);
		when(mockedGet.getResponseBodyAsString()).thenThrow(new IOException());	

		testClient.getIOR(testIp);
	}

	@Test(expected = RequestFailedException.class)
	public void test_GetIOR_throws_HttpException() throws Exception {
		PowerMockito.whenNew(GetMethod.class).withArguments(testUrl)
				.thenReturn(mockedGet);
		when(mockedClient.executeMethod(mockedGet))
				.thenReturn(HttpStatus.SC_OK);
		when(mockedGet.getResponseBodyAsString()).thenThrow(new HttpException());	

		testClient.getIOR(testIp);
	}
}
