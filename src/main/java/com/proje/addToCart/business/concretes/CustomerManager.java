package com.proje.addToCart.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proje.addToCart.business.abstracts.CustomerService;
import com.proje.addToCart.dataAccess.abstracts.CustomerDao;
import com.proje.addToCart.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;

	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	@Transactional
	public List<Customer> getAll() {
		return customerDao.findAll();
		
	}

	@Override
	@Transactional
	public void add(Customer customer) {
		Customer _customer =new Customer();
		_customer.setCustomerName(customer.getCustomerName());
		_customer.setSurname(customer.getSurname());
		_customer.setMail(customer.getMail());
		_customer.setPassw(customer.getPassw());
		_customer.setCity(customer.getCity());
		
		customerDao.save(customer);
		
	}

	@Override
	@Transactional
	public void update(int id, Customer customer) {
		Customer _customer=customerDao.getOne(id);
		_customer.setCustomerName(customer.getCustomerName());
		_customer.setSurname(customer.getSurname());
		_customer.setMail(customer.getMail());
		_customer.setPassw(customer.getPassw());
		_customer.setCity(customer.getCity());
		
		customerDao.save(customer);
	}

	@Override
	@Transactional
	public void delete(int id) {
		customerDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public Customer getById(int id) {
		return customerDao.getOne(id);
	}
	
	

}
