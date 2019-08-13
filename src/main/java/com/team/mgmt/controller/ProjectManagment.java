package com.team.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.mgmt.entity.Project;
import com.team.mgmt.entity.WorkStreams;
import com.team.mgmt.mapper.ProjectMapper;
import com.team.mgmt.model.ProjectDetails;
import com.team.mgmt.model.WorkStreamsDetails;
import com.team.mgmt.response.ResponseBean;
import com.team.mgmt.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectManagment {

	@Autowired
	ProjectService projectService;
	
	@PostMapping("/add")
	public ResponseEntity<ResponseBean> addProject(@RequestBody ProjectDetails projectDetails) {
		
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseBean response=new ResponseBean();
		Project project = ProjectMapper.convertToprojectDetailsToproject(projectDetails);
		System.out.println("project =>"+project);
		try {
			projectService.addProject(project);
			response.setResultCode(200);
			response.setResultMessage("ok");
		}catch(Exception e) {
			System.out.println("=>"+e);
			response.setResultCode(-1);
			response.setResultMessage(e.getMessage());
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<ResponseBean>(response, new HttpHeaders(), httpStatus);
		
	}
	
	@DeleteMapping("/delete/{projectId}")
	public ResponseEntity<ResponseBean> deleteProject(@PathVariable String projectId) {
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseBean response=new ResponseBean();
		try {
			projectService.deleteProject(projectId);
			response.setResultCode(200);
			response.setResultMessage("ok");
		} catch (Exception e) {
			response.setResultCode(-1);
			response.setResultMessage(e.getMessage());
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<ResponseBean>(response, new HttpHeaders(), httpStatus);
	}
	
	@PostMapping("/workStream/add")
	public ResponseEntity<ResponseBean> addWorkStreamProject(@RequestBody WorkStreamsDetails workStreamDetail) {
		System.out.println("projectDetails =>"+workStreamDetail);
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseBean response=new ResponseBean();
		WorkStreams workStreams = ProjectMapper.convertToWorkStremsDetailsToWorkStream(workStreamDetail);
		try {
			projectService.addWorkStreams(workStreams);
			response.setResultCode(200);
			response.setResultMessage("ok");
		}catch(Exception e) {
			System.out.println("=>"+e);
			response.setResultCode(-1);
			response.setResultMessage(e.getMessage());
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<ResponseBean>(response, new HttpHeaders(), httpStatus);
		
	}
}
