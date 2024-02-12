package com.feuji.employeeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.feuji.employeeservice.bean.UserValidationBean;
import com.feuji.employeeservice.repository.UserLoginRepo;
import com.feuji.employeeservice.service.UserLoginValidation;
import com.feuji.employeeservice.serviceimpl.UserLoginValidationImpl;

import jakarta.persistence.Column;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/userlogin")
public class UserLoginController {
	
	
	

	private static Logger log = LoggerFactory.getLogger(UserLoginController.class);
	
	@Autowired
	UserLoginRepo userLoginRepo;
	
	@Autowired
	UserLoginValidation userLoginValidation;
	@PostMapping("/validation")
	public 	ResponseEntity<String>  userLogin(@RequestBody UserValidationBean userValidationBean)
	{
		log.info("login validation", userValidationBean);
		ResponseEntity<String> responseEntity = userLoginValidation.userValidation(userValidationBean);
		return responseEntity;
	}
	

}
