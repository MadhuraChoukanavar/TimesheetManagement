package com.feuji.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feuji.employeeservice.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
