package com.capgemini.xyz.exception;

public class CustomerDetailNotFound extends Exception{

	public CustomerDetailNotFound() {
		super();
	}

	public CustomerDetailNotFound(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomerDetailNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerDetailNotFound(String message) {
		super(message);
	}

	public CustomerDetailNotFound(Throwable cause) {
		super(cause);
	}

}
