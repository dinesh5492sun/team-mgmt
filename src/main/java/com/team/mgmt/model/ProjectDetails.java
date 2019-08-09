package com.team.mgmt.model;


import java.io.Serializable;

import lombok.Data;

@Data
public class ProjectDetails implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String shortName;
	private String description;
}
