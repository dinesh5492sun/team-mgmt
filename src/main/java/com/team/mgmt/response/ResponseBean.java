package com.team.mgmt.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.team.mgmt.model.EmployeeDetails;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
@XmlRootElement
public class ResponseBean {
	private int resultCode;
	private String resultMessage;
	private EmployeeDetails employeeDetails;
	
	
}
