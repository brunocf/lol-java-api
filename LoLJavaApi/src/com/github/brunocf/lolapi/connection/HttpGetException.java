package com.github.brunocf.lolapi.connection;

public class HttpGetException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8728272185859226574L;

	public HttpGetException(String message) {
		super(message);
	}
	
	public HttpGetException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
