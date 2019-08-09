package com.team.mgmt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.team.mgmt.entity.UserLogin;
import com.team.mgmt.repository.UserLoginRepository;


@Service
public class JwtUserDetailsServiceImp implements UserDetailsService {
	
	@Autowired
	UserLoginRepository userLoginRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserLogin userLogin=userLoginRepository.getLoginDetails(username);
		if(userLogin !=null && userLogin.getUsername().equals(username) /*&& userLogin.getPassword().equals("password")*/){
			return new User(username, "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}
