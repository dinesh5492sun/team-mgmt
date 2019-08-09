package com.team.mgmt.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.mgmt.entity.Project;
import com.team.mgmt.entity.WorkStreams;
import com.team.mgmt.repository.ProjectRepository;
import com.team.mgmt.repository.WorkStreamsRepository;

@Repository
public class ProjectRepoImp implements ProjectRepo {

	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	WorkStreamsRepository workStreamsRepository;
	
	@Override
	public void addProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void deleteProject(String ProjectId) throws Exception {
		Project project=new Project();
		project.setID(ProjectId);
		workStreamsRepository.deleteProjectDetails(project);
		projectRepository.delete(project);
	}

	@Override
	public void addWorkStreams(WorkStreams workStreams) throws Exception {
		workStreamsRepository.save(workStreams);
	}

}
