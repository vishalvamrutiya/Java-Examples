package com.kanaiya.firstspring.web.dao;

import java.util.List;

import com.kanaiya.firstspring.web.model.Employee;

public interface IEmployeeDao {

	void addEmployee(Employee p);

	List<Employee> getEmployeeList();

	Employee getEmployeeById(int id);

	void removeEmployee(int id);

}
