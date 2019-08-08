package com.team.mgmt.mapper;

import com.team.mgmt.entity.Project;
import com.team.mgmt.entity.WorkStreams;
import com.team.mgmt.model.ProjectDetails;
import com.team.mgmt.model.WorkStreamsDetails;

public class ProjectMapper {

	public static Project convertToprojectDetailsToproject(ProjectDetails empDetails) {
		return new Project(empDetails.getId(),empDetails.getName(),empDetails.getShortName(),empDetails.getDescription());
	}
	public static WorkStreams convertToWorkStremsDetailsToWorkStream(WorkStreamsDetails workStreamsDetails) {
		
		return new WorkStreams(workStreamsDetails.getWorkstreamID(),workStreamsDetails.getWorkstreamName(),workStreamsDetails.getWorkstreamParentID(),new Project(workStreamsDetails.getProjectId()));
	}
}
