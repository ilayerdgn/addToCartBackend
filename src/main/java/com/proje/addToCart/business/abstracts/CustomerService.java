package com.proje.addToCart.business.abstracts;

import java.util.List;

import com.proje.addToCart.entities.concretes.Customer;

public interface CustomerService {
	
	List<Customer> getAll();
	void add(Customer customer);
	void update(int id, Customer customer);
	void delete(int id);
	Customer getById(int id);
	
	
	

}
