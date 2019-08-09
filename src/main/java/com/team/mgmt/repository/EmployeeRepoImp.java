package com.team.mgmt.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.mgmt.entity.EmpAdvanced;
import com.team.mgmt.entity.EmpBasic;

@Repository
public class EmployeeRepoImp implements EmployeeRepo{

	@Autowired
	EmpAdvancedRepository empAdvancedRepository;
	
	@Autowired
	EmpBasicRepository  empBasicRepository;
	
	@Override
	public void addEmployee(EmpAdvanced empAdvanced){
		System.out.println("before save =>"+empAdvanced);
		empAdvancedRepository.save(empAdvanced);
	}

	@Override
	public void deleteEmployee(Long empId) throws Exception {
		EmpBasic empBasic=new EmpBasic();
		empBasic.setID(empId);
		empAdvancedRepository.deleteEmpDetails(empBasic);
		empBasicRepository.delete(empBasic);
	}

	@Override
	public List<EmpAdvanced> getAllEmployeeDetails() throws Exception {
			
		return empAdvancedRepository.findAll();
		
	}

}
