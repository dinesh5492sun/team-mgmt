package com.team.mgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.mgmt.entity.EmpAdvanced;
import com.team.mgmt.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public void addEmployee(EmpAdvanced empAdvanced) throws Exception {
		employeeRepo.addEmployee(empAdvanced);
	}
	@Override
	public void deleteEmployee(Long empId) throws Exception {
		employeeRepo.deleteEmployee(empId);
		
	}
	@Override
	public List<EmpAdvanced> getAllEmployeeDetails() throws Exception {
		
		return employeeRepo.getAllEmployeeDetails();
	}

}
