package com.team.mgmt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.mgmt.entity.EmpAdvanced;
import com.team.mgmt.mapper.EmployeeMapper;
import com.team.mgmt.model.EmployeeDetails;
import com.team.mgmt.response.ResponseBean;
import com.team.mgmt.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmpManagment {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
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
	
		System.out.println("employeeDetails 1"+employeeDetails);
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseBean response=new ResponseBean();
		EmpAdvanced empAdvanced = EmployeeMapper.convertToEmpAdvancedWithEmpBasic(employeeDetails);
		System.out.println("empAdvanced 2"+empAdvanced);
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
	
	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<ResponseBean> deleteEmployee(@PathVariable Long employeeId) {
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseBean response=new ResponseBean();
		try {
			employeeService.deleteEmployee(employeeId);
			response.setResultCode(200);
			response.setResultMessage("ok");
		} catch (Exception e) {
			System.out.println("=>"+e);
			response.setResultCode(-1);
			response.setResultMessage(e.getMessage());
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<ResponseBean>(response, new HttpHeaders(), httpStatus);
	}
	
	@GetMapping("/allEmployeeDetails")
	public ResponseEntity<ResponseBean> getAllEmployee() {
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseBean response=new ResponseBean();
		try {
			List<EmpAdvanced> empDetails=employeeService.getAllEmployeeDetails();
			System.out.println(empDetails);
			ArrayList<EmployeeDetails> employeeDetails = EmployeeMapper.convertToEmpAdvancedWithEmployeeDetails(empDetails);
			response.setResultCode(200);
			response.setResultMessage("ok");
			response.setEmployeeDetails(employeeDetails);
		} catch (Exception e) {
			System.out.println("=>"+e);
			response.setResultCode(-1);
			response.setResultMessage(e.getMessage());
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<ResponseBean>(response, new HttpHeaders(), httpStatus);
	} 
	
}
