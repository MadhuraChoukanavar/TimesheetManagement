package com.feuji.employeeservice.exception;

public class UserNotFoundException extends RuntimeException{
	
	String message;
	
	public  UserNotFoundException() {
	
	

	}

	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}
	

}
