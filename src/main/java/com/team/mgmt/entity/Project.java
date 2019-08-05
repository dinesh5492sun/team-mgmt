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
	@Column(name = "PROJECT_ID")
	private Long projectId;
	
	@Column(name = "PROJECT_NAME")
	private String projectName;
	
	@Column(name = "PROJECT_SHORT_NAME")
	private String projectShortName;
	
	@Column(name = "PROJECT_DESCRIPTION")
	private String project_description;
	
}
