package com.feuji.employeeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ExceptionHandelar {
	
	
//	@ExceptionHandler(value = ResourceNotFoundException.class)
//	public ResponseEntity<String> exception(ResourceNotFoundException exception) {
//		log.error("ResourceNotFoundException-" + exception.getMessage(), exception);
//		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	//}
	
	
//	@ExceptionHandler(value = UserNotFoundException.class)
//	public ResponseEntity<String> exception(UserNotFoundException exception)
//	{
//		log.error("UserNotFoundException - "+exception.getMessage(),exception);
//		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
//		
//	}

}
