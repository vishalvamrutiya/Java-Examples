package com.kanaiya.firstspring.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kanaiya.firstspring.web.model.Employee;

@Repository("employeeDao")
public class EmployeeDao implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addEmployee(Employee p) {
		Session session = null;
		session = this.sessionFactory.getCurrentSession();
		if (p.getId() == 0) {
			session.persist(p);
		} else {
			session.update(p);
		}
	}

	@Override
	public List<Employee> getEmployeeList() {
		return this.sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, new Integer(id));
		return employee;
	}

	@Override
	public void removeEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, new Integer(id));
		session.delete(employee);
	}
}
