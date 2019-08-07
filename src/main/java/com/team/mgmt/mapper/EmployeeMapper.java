package com.team.mgmt.mapper;

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

}