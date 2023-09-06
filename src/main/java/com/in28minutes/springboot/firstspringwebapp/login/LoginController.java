package com.in28minutes.springboot.firstspringwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


	///login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login.jsp

	//Model is used to pass anything to a jsp page
	@RequestMapping("login")
	public String gotoLoginPage() {
		return "login";
	}
}