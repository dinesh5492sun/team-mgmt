package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Table(name = "LOGIN_DETAILS")
@Entity
@Data
public class UserLogin implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long Id;
	
	@Column(length = 50,unique = true)
	private String username;
	
	@NotNull
	@Column(unique = true)
	private String email;
	
	@NotNull
	private String Password;
}
