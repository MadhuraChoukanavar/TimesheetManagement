package com.feuji.employeeservice.exception;

public class PasswordMissmatchException  extends RuntimeException{
	String message;
	
	public PasswordMissmatchException()
	{
		
	}
	public PasswordMissmatchException(String message) {
		super();
		this.message = message;
	}
	

}
