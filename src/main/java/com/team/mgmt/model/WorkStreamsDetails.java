package com.team.mgmt.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class WorkStreamsDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String workstreamID;
	private String workstreamName;
	private String  workstreamParentID;
	private String projectId;

}
