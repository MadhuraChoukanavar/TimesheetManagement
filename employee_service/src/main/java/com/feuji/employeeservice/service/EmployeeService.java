package com.feuji.employeeservice.service;

import com.feuji.employeeservice.bean.EmployeeBean;
import com.feuji.employeeservice.entity.EmployeeEntity;

public interface EmployeeService {
	
	public EmployeeEntity saveEmployee(EmployeeBean employeeBean);

	public EmployeeEntity getById(Long Id);

	public void updateEmployeeDetails(EmployeeEntity updateEmpolyee, Long id) throws Throwable;


}
