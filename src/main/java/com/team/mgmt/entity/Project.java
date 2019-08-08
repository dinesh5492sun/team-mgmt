package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "PROJECT")
@Entity
@Data
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "PROJECT_ID",nullable = false, length = 50)
	private String ID;
	
	@Column(name = "PROJECT_NAME")
	private String name;
	
	@Column(name = "PROJECT_SHORT_NAME")
	private String ShortName;
	
	@Column(name = "PROJECT_DESCRIPTION")
	private String description;

	public Project(String iD, String name, String shortName, String description) {
		super();
		ID = iD;
		this.name = name;
		ShortName = shortName;
		this.description = description;
	}
	public Project(String iD) {
		super();
		ID = iD;
	}

	public Project() {
		super();
	}
	
	
	
}
