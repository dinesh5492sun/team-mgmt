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
	private Long ID;
	
	@Column(name = "EMPLOYEE_FIRST_NAME")
	private String firstName;
	
	@Column(name = "EMPLOYEE_MIDDLE_NAME")
	private String middleName;
	
	@Column(name = "EMPLOYEE_LAST_NAME")
	private String lastName;
	
	@Column(name = "EMPLOYEE_EMAIL")
	private String email;
	
	@Column(name = "EMPLOYEE_PHONE")
	private String phone;
	
	@Column(name = "EMPLOYEE_GENDER")
	private String gender;

}
