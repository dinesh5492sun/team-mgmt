package com.team.mgmt.service;

import java.util.List;

import com.team.mgmt.entity.EmpAdvanced;

public interface EmployeeService {

	public void addEmployee(EmpAdvanced empAdvanced) throws Exception;
	public void deleteEmployee(Long empId) throws Exception;
	public List<EmpAdvanced> getAllEmployeeDetails() throws Exception;
}
