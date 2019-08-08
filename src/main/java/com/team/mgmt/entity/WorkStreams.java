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


@Table(name = "WORK_STREAMS")
@Entity
@Data
public class WorkStreams  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "WORKSTREAM_ID",nullable = false, length = 50)
	private String workstreamID;
	
	@Column(name = "WORKSTREAM_NAME")
	private String workstreamName;
	
	@Column(name = "WORKSTREAM_PARENT_ID")
	private String  workstreamParentID;
	
	@OneToOne
	//@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	@JoinColumn(name="PROJECT_ID")
	private Project projectId;

	public WorkStreams(String workstreamID, String workstreamName, String workstreamParentID, Project projectId) {
		super();
		this.workstreamID = workstreamID;
		this.workstreamName = workstreamName;
		this.workstreamParentID = workstreamParentID;
		this.projectId = projectId;
	}
	public WorkStreams() {
		super();
	}
	
	
}
