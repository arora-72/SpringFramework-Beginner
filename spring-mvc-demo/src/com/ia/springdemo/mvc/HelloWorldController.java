package com.ia.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//controller to show initial HTML forms
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	
	//controller to process HTML forms
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	

}
