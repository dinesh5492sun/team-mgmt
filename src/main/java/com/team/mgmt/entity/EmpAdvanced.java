package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@Table(name = "EMP_ADVANCED")
@Entity
@Data
public class EmpAdvanced  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	@JoinColumn(name="EMPLOYEE_ID")
	private EmpBasic employeeId;
	
	@Column(name = "EMPLOYEE_ADDRESS")
	private String employeeAddress;
	
	@Column(name = "EMPLOYEE_MAL")
	private String employeeMal;
	
	@Column(name = "EMPLOYEE_PRIMARY_SKILL")
	private String employeePrimarySkill;
	
	@Column(name = "EMPLOYEE_PROFICIENCY")
	private String employeeProficiency;
	
}
