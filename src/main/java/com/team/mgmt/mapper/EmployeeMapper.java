package com.team.mgmt.mapper;

import java.util.ArrayList;
import java.util.List;

import com.team.mgmt.entity.EmpAdvanced;
import com.team.mgmt.entity.EmpBasic;
import com.team.mgmt.model.EmployeeDetails;

public class EmployeeMapper {
	
	public static EmpAdvanced convertToEmpAdvancedWithEmpBasic(EmployeeDetails empDetails) {
		EmpBasic emp=new EmpBasic();
		emp.setID(empDetails.getEmployeeId());
		emp.setFirstName(empDetails.getFirstName());
		emp.setMiddleName(empDetails.getMiddleName());
		emp.setLastName(empDetails.getLastName());
		emp.setPhone(empDetails.getPhone());
		emp.setEmail(empDetails.getEmail());
		emp.setGender(empDetails.getGender());
		return new EmpAdvanced(emp,empDetails.getMal(),empDetails.getAddress(),empDetails.getPrimarySkill(),empDetails.getProficiency());
	}
	
	public static ArrayList<EmployeeDetails> convertToEmpAdvancedWithEmployeeDetails(List<EmpAdvanced> empAdvanced) {
		
		ArrayList<EmployeeDetails> empDetails=new ArrayList<EmployeeDetails>();

		empAdvanced.stream().forEach(i->{
			empDetails.add(new EmployeeDetails(i.getEmployeeId().getID(),i.getEmployeeId().getFirstName(),
					i.getEmployeeId().getMiddleName(),i.getEmployeeId().getLastName(),
					i.getEmployeeId().getEmail(),i.getEmployeeId().getPhone(),i.getEmployeeId().getGender(),
					i.getAddress(),i.getMal(),i.getPrimarySkill(),
					i.getProficiency()));
		});
		
		return empDetails;
	}

}