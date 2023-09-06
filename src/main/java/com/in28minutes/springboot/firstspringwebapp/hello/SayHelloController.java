package com.in28minutes.springboot.firstspringwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"say-hello" is the url => "Hello World!" is the response

	@RequestMapping("say-hello")
	@ResponseBody //this is to tell spring that the response is not a view but a string
	public String sayHello() {
		return "Hello Wooorld!"; //it will be looking for a view if we return a string
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		return "<html><title>My title </title><body><h1>Hello Wooorld!</h1></body></html>";
	}

	//JSP is a view technology called Java Server Pages
	//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello"; //name of the jsp file
	}

}
