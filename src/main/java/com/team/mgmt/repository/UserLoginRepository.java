package com.team.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.team.mgmt.entity.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, String>  {
	
	@Query("SELECT a FROM UserLogin a WHERE a.username = ?1")
	UserLogin getLoginDetails(String userName);

}
