package com.feuji.employeeservice.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.feuji.employeeservice.bean.UserValidationBean;
import com.feuji.employeeservice.controller.UserLoginController;
import com.feuji.employeeservice.entity.UserEntity;
import com.feuji.employeeservice.exception.PasswordMissmatchException;

import com.feuji.employeeservice.exception.UserNotFoundException;
import com.feuji.employeeservice.repository.UserLoginRepo;
import com.feuji.employeeservice.service.UserLoginValidation;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class UserLoginValidationImpl  implements UserLoginValidation{
	
	private static Logger log = LoggerFactory.getLogger(UserLoginController.class);
	@Autowired
	UserLoginRepo userLoginRepo;
	
	@Override
	public ResponseEntity<String> userValidation(UserValidationBean userValidationBean) {
		log.info("getting user email"+userValidationBean);
		try {
			UserEntity userEntity = userLoginRepo.getByEmail(userValidationBean.getUserEmail());
			
			if(userEntity ==null || userValidationBean.equals(null))
			{
				log.info(" user not found");
				return new ResponseEntity<>("user not found ",HttpStatus.BAD_REQUEST);
				
			}
					
			else if(userValidationBean.getPassword().equals(userEntity.getUserPassword()))
			{
				  log.info("Login successful");
	                return new ResponseEntity<>("Login successful", HttpStatus.OK);
			}
			else {
				
				   log.info("Password mismatch");
	                return new ResponseEntity<>("Password mismatch", HttpStatus.UNAUTHORIZED);
				
			}
			
			
		} 
		catch (Exception e) {
			log.info(e.getMessage());
		    return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
	
	}

}
