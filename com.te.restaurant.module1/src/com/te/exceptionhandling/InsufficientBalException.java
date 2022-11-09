package com.te.exceptionhandling;

public class InsufficientBalException extends RuntimeException {
	
    String message;
    public InsufficientBalException(String message) {
    	this.message=message;
    	
    }
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
    

}
