package com.team.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team.mgmt.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, String> {

}
