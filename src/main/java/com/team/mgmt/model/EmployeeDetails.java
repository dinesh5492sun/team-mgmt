package com.team.mgmt.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String phone;
	private String gender;
	private String address;
	private String mal;
	private String primarySkill;
	private String proficiency;
	public EmployeeDetails(Long employeeId, String firstName, String middleName, String lastName, String email,
			String phone, String gender, String address, String mal, String primarySkill, String proficiency) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.mal = mal;
		this.primarySkill = primarySkill;
		this.proficiency = proficiency;
	}
	public EmployeeDetails() {
		super();
	}

}
