package com.proje.addToCart.business.abstracts;

import java.util.List;

import com.proje.addToCart.entities.concretes.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();
	void add(Employee employee);
	void update(int id, Employee employee);
	void delete(int id);
	Employee getById(int id);

}
