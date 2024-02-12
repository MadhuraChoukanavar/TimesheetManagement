package com.feuji.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.feuji.employeeservice.entity.UserEntity;

public interface UserLoginRepo extends JpaRepository<UserEntity, Integer> {
	@Query(value="select * from user_details where user_email=? ",nativeQuery=true )
	public UserEntity getByEmail(String userEmail);
	
	

}
