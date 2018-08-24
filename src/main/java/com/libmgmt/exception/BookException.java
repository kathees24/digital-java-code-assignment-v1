package com.libmgmt.exception;

/**
 * @author kathees
 * 
 */
public class BookException {
	private String errorMessage;

	public BookException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
