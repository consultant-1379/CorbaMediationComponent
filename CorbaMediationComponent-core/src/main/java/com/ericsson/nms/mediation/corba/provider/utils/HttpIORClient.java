/*-----
 * -------------------------------------------------------------------------
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

import java.io.IOException;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class HttpIORClient {

    public static void main(final String[] args) {
        final HttpIORClient testHttpIORClient = new HttpIORClient();
        for (final String ipArgs : args) {
            final String testIpAddr = ipArgs;
            final String testResult = testHttpIORClient.getIOR(testIpAddr);
            System.out.println("Test result for IP arguments " + testResult);
        }
    }

    /**
     * HttpClient which allows the execution of the http get request
     */
    private final HttpClient client;

    private static final String URL = "http://%s:80/cello/ior_files/nameroot.ior";

    /** Timeout for opening the URL connection to cello. */
    private static final int TIMEOUT = 5 * 1000; // One minute

    public HttpIORClient() {
        final MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
        final HttpConnectionManagerParams clientParams = connectionManager.getParams();
        clientParams.setConnectionTimeout(TIMEOUT);
        clientParams.setSoTimeout(TIMEOUT);
        clientParams.setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
        client = new HttpClient(connectionManager);
    }

    public HttpIORClient(final HttpClient client) {
        this.client = client;
    }

    /**
     * 
     * @param ip
     * @return Interoperable Object Reference (ior)
     */
    public String getIOR(final String ip) {

        final String celloURL = String.format(URL, ip);

        final GetMethod getMethod = new GetMethod(celloURL);

        int statusCodeResponse;
        try {
            statusCodeResponse = this.client.executeMethod(getMethod);

            if (statusCodeResponse != HttpStatus.SC_OK) {
                throw new RequestFailedException("Failure status code received =" + statusCodeResponse);
            }
            // Read the response body.
            final String responseBodyIor = getMethod.getResponseBodyAsString();
            return responseBodyIor;
        } catch (final HttpException e) {
            throw new RequestFailedException("HTTP or HttpClient exception has occurred.", e);
        } catch (final IOException e) {
            throw new RequestFailedException("Client is unable to establish a connection with the target during the timeout period.", e);
        } finally {
            getMethod.releaseConnection();
        }
    }
}
