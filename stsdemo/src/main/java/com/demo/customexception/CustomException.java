package com.demo.customexception;

public class CustomException extends Exception {
	private String message;

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

}
