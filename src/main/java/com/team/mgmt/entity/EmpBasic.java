package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "EMP_BASIC")
@Entity
@Data
public class EmpBasic implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMPLOYEE_ID")
	private Long employeeId;
	
	@Column(name = "EMPLOYEE_FIRST_NAME")
	private String employeeFirstName;
	
	@Column(name = "EMPLOYEE_MIDDLE_NAME")
	private String employeeMiddleName;
	
	@Column(name = "EMPLOYEE_LAST_NAME")
	private String employeeLastName;
	
	@Column(name = "EMPLOYEE_EMAIL")
	private String employeeEmail;
	
	@Column(name = "EMPLOYEE_PHONE")
	private String employeePhone;
	
	@Column(name = "EMPLOYEE_GENDER")
	private String employeeGender;

}
