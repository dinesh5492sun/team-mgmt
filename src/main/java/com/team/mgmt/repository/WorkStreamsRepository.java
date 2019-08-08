package com.team.mgmt.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.team.mgmt.entity.Project;
import com.team.mgmt.entity.WorkStreams;

public interface WorkStreamsRepository extends JpaRepository<WorkStreams, String> {

	@Transactional
	@Modifying
	@Query("DELETE FROM WorkStreams a WHERE a.projectId= ?1")
	void deleteProjectDetails(Project project);
}
