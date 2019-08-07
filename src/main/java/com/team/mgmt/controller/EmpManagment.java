package com.team.mgmt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.team.mgmt.entity.EmpAdvanced;
import com.team.mgmt.mapper.EmployeeMapper;
import com.team.mgmt.model.EmployeeDetails;
import com.team.mgmt.model.ResponseBean;
import com.team.mgmt.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmpManagment {
	
	
	@Autowired
	EmployeeService employeeService;
	Gson gson = new Gson();
	
	//private static final String TEAM_MGMT = "team_mgmt";
	//private static final Logger log = LoggerFactory.getLogger(TEAM_MGMT);

	/**
	 * 
	 * @PathParam 
	 * @QueryParam 
	 * @return 
	 */
	
	
	@PostMapping("/add")
	public ResponseEntity<ResponseBean> addEmployee(@RequestBody EmployeeDetails employeeDetails) {
	
		
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseBean response=new ResponseBean();
		EmpAdvanced empAdvanced = EmployeeMapper.convertToEmpAdvancedWithEmpBasic(employeeDetails);
		try {
			employeeService.addEmployee(empAdvanced);
			response.setResultCode(200);
			response.setResultMessage("ok");
		}catch(Exception e) {
			System.out.println("=>"+e);
			response.setResultCode(-1);
			response.setResultMessage(e.getMessage());
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<ResponseBean>(response, new HttpHeaders(), httpStatus);
		
	}
}
