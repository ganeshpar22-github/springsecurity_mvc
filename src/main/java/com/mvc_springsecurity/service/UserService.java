package com.mvc_springsecurity.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mvc_springsecurity.model.User;
import com.mvc_springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	//this method will save registration details
	User save(UserRegistrationDto registrationDto);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
	
}
