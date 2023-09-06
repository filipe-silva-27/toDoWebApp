package com.in28minutes.springboot.firstspringwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

	///login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login.jsp

	//Model is used to pass anything to a jsp page

	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		System.out.println("Name is : " + name); // NOT RECOMMENDED FOR PRODUCTION
		return "login";
	}
}