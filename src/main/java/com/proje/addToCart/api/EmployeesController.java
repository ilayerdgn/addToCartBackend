package com.proje.addToCart.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proje.addToCart.business.abstracts.EmployeeService;
import com.proje.addToCart.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Employee employee) {
	
		this.employeeService.add(employee);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Employee employee) {
		this.employeeService.update(id,employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.employeeService.delete(id);
	}
	
	
	
	
	
	

}
