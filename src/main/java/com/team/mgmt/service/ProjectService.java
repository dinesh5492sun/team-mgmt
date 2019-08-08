package com.team.mgmt.service;

import com.team.mgmt.entity.Project;
import com.team.mgmt.entity.WorkStreams;

public interface ProjectService {
	
	public void addProject(Project project) throws Exception;
	public void deleteProject(String ProjectId) throws Exception;
	public void addWorkStreams(WorkStreams workStreams) throws Exception;
}
