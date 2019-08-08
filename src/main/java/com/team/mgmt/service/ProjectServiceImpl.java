package com.team.mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.mgmt.entity.Project;
import com.team.mgmt.entity.WorkStreams;
import com.team.mgmt.repository.ProjectRepo;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepo projectRepo;
	@Override
	public void addProject(Project project) throws Exception {
		projectRepo.addProject(project);
	}
	@Override
	public void deleteProject(String ProjectId) throws Exception {
		projectRepo.deleteProject(ProjectId);
	}
	@Override
	public void addWorkStreams(WorkStreams workStreams) throws Exception {
		projectRepo.addWorkStreams(workStreams);
	}

}
