package com.ia.springdemo.mvc;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	//controller: add data and model
	@RequestMapping("/processFormV2")
	public String getData(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "yo" + theName;
		model.addAttribute("message", result);
		return "helloWorld";
	}

}
