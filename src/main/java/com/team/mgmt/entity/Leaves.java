package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "LEAVES")
@Entity
@Data
public class Leaves  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "LEAVE_ID")
	private Long leaveID;
	
	@Column(name = "LEVEL_NAME")
	private String levelName;
	
	@Column(name = "LEAVE_SHORTNAME")
	private String  leaveShortName;
	
	@Column(name = "LEAVE_DESCRIPTION")
	private String  leaveDescription
;
}
