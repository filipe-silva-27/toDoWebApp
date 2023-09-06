package com.in28minutes.springboot.firstspringwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	///login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login.jsp

	//Model is used to pass anything to a jsp page

	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Name is : {}", name); // NOT RECOMMENDED FOR PRODUCTION
		return "login";
	}
}