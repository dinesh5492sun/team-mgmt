package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Table(name = "CAREER_LEVEL")
@Entity
@Data
public class CareerLevel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "LEVEL_ID")
	private Long levelID;
	
	@Column(name = "LEVEL_NAME")
	private String levelName;
	
	@Column(name = "LEVEL")
	private String  level;

}
