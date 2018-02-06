package com.kanaiya.firstspring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kanaiya.firstspring.web.model.Employee;

@Controller
@RequestMapping(value="/admin")
public class EmployeeController {

	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String getListOfEmployee(Model model) {
		model.addAttribute("employee", new Employee());		
		return "employee";
	}
	
	@RequestMapping(value="/employee/add",method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee p) {
		
		return "redirect:/admin/list";
	}
}
