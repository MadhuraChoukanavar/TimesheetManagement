package com.feuji.employeeservice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.feuji.employeeservice.bean.UserValidationBean;


public interface UserLoginValidation {
	public ResponseEntity<String> userValidation(UserValidationBean userValidationBean);

}
