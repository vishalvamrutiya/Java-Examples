package com.kanaiya.firstspring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kanaiya.firstspring.web.model.Employee;
import com.kanaiya.firstspring.web.service.IEmployeeService;

@Controller
@RequestMapping(value="/admin")
public class EmployeeController {
	
	private IEmployeeService employeeService;
	
	
	@Autowired(required=true)
	@Qualifier(value="employeeService")
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String getListOfEmployee(Model model) {
		model.addAttribute("employee", new Employee());	
		model.addAttribute("list", this.employeeService.list());
		return "employee";
	}
	
	@RequestMapping(value="/employee/add",method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee p) {
		employeeService.addEmployee(p);
		return "redirect:/admin/list";
	}
	
	@RequestMapping(value="/employee/remove/{id}",method=RequestMethod.GET)
	public String removeEmployee(@PathVariable("id") int  id) {
		employeeService.removeEmployee(id);
		return "redirect:/admin/list";
	}
	
	@RequestMapping(value="/employee/edit/{id}",method=RequestMethod.GET)
	public String editEmployee(@PathVariable("id") int  id,Model model) {
		model.addAttribute("employee",this.employeeService.getEmployeeById(id));		
		model.addAttribute("list", this.employeeService.list());
		return "employee";
	}
}
