package com.devsuperior.dsclient.services.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4203137283302155920L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
