package com.in28minutes.springboot.firstspringwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {



	//only when the request is a GET request, this method
	// will be called because for POST  (fll the form)
	// it will redirect to welcome
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value="login", method = RequestMethod.POST)
	public String gotoWelcomePage(
		@RequestParam String name, @RequestParam String password, ModelMap model) {

		model.put("name", name);
		model.put("password", password);

		return "welcome";
	}
}