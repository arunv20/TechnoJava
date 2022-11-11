package com.te.studentmanagement;

public class InvalidInputExcception extends RuntimeException {
	String message;

	public InvalidInputExcception(String message) {
		this.message = message;

	}

	public String getMessage() {
		return this.message;
	}

}
