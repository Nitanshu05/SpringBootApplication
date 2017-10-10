package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.demo.entity.Article;
import com.test.demo.services.AriticalServices;

@Controller
@RequestMapping("/services/")
public class Restcontroller {
 
	@Autowired 
	AriticalServices ariticalServices;
	
	@RequestMapping("/test")
	 @ResponseBody String home(Model modal) {
		System.out.println("test 1");
		modal.addAttribute("title", "Test");
		modal.addAttribute("message", "Welcome to SpringBoot Application");
		return "Welcome to SpringBoot Application";
	}
	@RequestMapping("/home")
	 public String hometest(Model modal) {
		System.out.println("test 11");
		modal.addAttribute("title", "Test");
		modal.addAttribute("message", "Welcome to SpringBoot Application");
		return "home";
	}
	
	@RequestMapping(value = "/createArtical", method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json")
	@ResponseBody Article createArtical(Model modal) {
		System.out.println("test 1save");
		/*modal.addAttribute("title", "Test");
		modal.addAttribute("message", "Welcome to SpringBoot Application");*/
		
		return ariticalServices.saveArtical();
	}
	
}
