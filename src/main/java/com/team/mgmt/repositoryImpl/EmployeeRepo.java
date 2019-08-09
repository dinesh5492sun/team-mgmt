package com.team.mgmt.repositoryImpl;

import java.util.List;

import com.team.mgmt.entity.EmpAdvanced;

public interface EmployeeRepo {

	public void addEmployee(EmpAdvanced empAdvanced);
	public void deleteEmployee(Long empId) throws Exception;
	public List<EmpAdvanced> getAllEmployeeDetails() throws Exception;
}
