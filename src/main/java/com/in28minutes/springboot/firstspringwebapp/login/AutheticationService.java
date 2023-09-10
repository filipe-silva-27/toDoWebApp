package com.in28minutes.springboot.firstspringwebapp.login;


import org.springframework.stereotype.Service;

@Service
public class AutheticationService {

	public boolean isUserValid(String user, String password) {
		// TODO Auto-generated method stub
		return user.equalsIgnoreCase("in28Minutes") && password.equals("dummy");
	}
}
