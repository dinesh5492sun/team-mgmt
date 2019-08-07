package com.team.mgmt.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.mgmt.entity.EmpAdvanced;

@Repository
public class EmployeeRepoImp implements EmployeeRepo{

	@Autowired
	EmpAdvancedRepository empAdvancedRepository;
	
	@Override
	public void addEmployee(EmpAdvanced empAdvanced){
		
		empAdvancedRepository.save(empAdvanced);
	}

}
