package com.kanaiya.firstspring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping(value= {"/**","/welcome"},method=RequestMethod.GET)
	public String login() {
		
		return "hello";
	}
	
	@RequestMapping(value= {"/403"},method=RequestMethod.GET)
	public String page403() {
		
		return "403";
	}
}
