package com.kanaiya.firstspring.web.service;

import com.kanaiya.firstspring.web.model.Employee;

public interface IEmployeeService {

	void addEmployee(Employee p);

	void removeEmployee(int id);

	Object getEmployeeById(int id);

	Object list();

}
