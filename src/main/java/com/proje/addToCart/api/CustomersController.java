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

import com.proje.addToCart.business.abstracts.CustomerService;
import com.proje.addToCart.entities.concretes.Customer;

@RestController
@RequestMapping("/api/customers")

public class CustomersController {
	
	private CustomerService customerService;

	@Autowired
	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/getall")
	public List<Customer> getAll(){
		return this.customerService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Customer customer) {
	
		this.customerService.add(customer);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Customer customer) {
		this.customerService.update(id,customer);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.customerService.delete(id);
	}
	
	

}
