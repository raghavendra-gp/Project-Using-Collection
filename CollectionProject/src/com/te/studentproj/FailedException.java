package com.te.studentproj;

public class FailedException extends RuntimeException {

	String message;

	public FailedException(String message) {
		super(message);
	}
	
	
}
