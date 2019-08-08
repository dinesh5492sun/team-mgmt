package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long Id;
	
	//@Id
	@OneToOne(fetch = FetchType.EAGER)
	@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	@JoinColumn(name="EMPLOYEE_ID")
	private EmpBasic employeeId;
	
	@Column(name = "EMPLOYEE_ADDRESS")
	private String address;
	
	@Column(name = "EMPLOYEE_MAL")
	private String mal;
	
	@Column(name = "EMPLOYEE_PRIMARY_SKILL")
	private String primarySkill;
	
	@Column(name = "EMPLOYEE_PROFICIENCY")
	private String proficiency;

	public EmpAdvanced(EmpBasic employeeId, String address, String mal, String primarySkill, String proficiency) {
		super();
		this.employeeId = employeeId;
		this.address = address;
		this.mal = mal;
		this.primarySkill = primarySkill;
		this.proficiency = proficiency;
	}

	public EmpAdvanced() {
	}
	
	
	
}
