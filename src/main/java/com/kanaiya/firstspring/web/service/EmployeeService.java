package com.kanaiya.firstspring.web.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kanaiya.firstspring.web.dao.IEmployeeDao;
import com.kanaiya.firstspring.web.model.Employee;

@Repository("employeeService")
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDao employeeDao; 
	
	@Override
	@Transactional
	public void addEmployee(Employee p) {
		employeeDao.addEmployee(p);
	}
	
	
	@Override
	@Transactional
	public List<Employee> list() {
		return employeeDao.getEmployeeList();
	}
	
	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}
	
	@Override
	@Transactional
	public void removeEmployee(int id) {
		employeeDao.removeEmployee(id);		
	}
}
