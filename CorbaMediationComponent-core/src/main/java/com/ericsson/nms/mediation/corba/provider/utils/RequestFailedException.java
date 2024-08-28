/**
 * 
 */
package com.ericsson.nms.mediation.corba.provider.utils;

/**
 * @author edanicu
 * 
 */
public class RequestFailedException extends RuntimeException {
	
	public RequestFailedException() {
		super();
	}

	/**
	 * @param message
	 * @param exception
	 */
	public RequestFailedException(final String message, final Exception exception) {
		super(message, exception);
	}
	public RequestFailedException(final String message) {
		super(message);
	}
	
}
