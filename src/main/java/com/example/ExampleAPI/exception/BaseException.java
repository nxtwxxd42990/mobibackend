package com.example.ExampleAPI.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends Exception {

	private static final long serialVersionUID = -91210955827403107L;
	private final HttpStatus status;
	
	protected BaseException (String code) {
		super(code);
		this.status = HttpStatus.EXPECTATION_FAILED;
	}
	
	protected BaseException (String code, HttpStatus status) {
		super(code);
		this.status = status;
	}
	public HttpStatus getHttpStatus() {
		return status;
	}
}
