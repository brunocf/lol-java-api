package com.github.brunocf.lolapi.connection;

public class HttpGetException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8728272185859226574L;

	private int httpResponse;
	
	public HttpGetException(String message, int httpResponse) {
		super(message);
		this.httpResponse = httpResponse; 
	}
	
	public HttpGetException(String message, Throwable cause, int httpResponse) {
		super(message, cause);
		this.httpResponse = httpResponse; 
	}

	public int getHttpResponse() {
		return httpResponse;
	}
	
}
