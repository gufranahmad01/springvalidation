package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Login;
import com.spring.repositories.LoginRepository;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepo;
	
	@Override
	public void saveLogin(Login login) {
		
		loginRepo.save(login);
	}

}
