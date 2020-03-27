package com.vs.jtomtomclient.requests.exceptions;

/**
 * Throw when the user did not inform a required parameter for request
 * 
 * @author Victor Santos
 *
 */
public class ParameterNotInformedException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ParameterNotInformedException(String message) {
		super(message);
	}
	
	public ParameterNotInformedException(String message, Throwable cause) {
		super(message, cause);
	}

}
