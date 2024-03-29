package com.proje.addToCart.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proje.addToCart.business.abstracts.OrderService;
import com.proje.addToCart.entities.concretes.Order;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
	private OrderService orderService;

	@Autowired
	public OrdersController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping("/getall")
	public List<Order> getAll(){
		return this.orderService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Order order) {
	
		this.orderService.add(order);
	}
	
	@PutMapping("/update")
	public Order update(@RequestBody Order order) {
		return this.orderService.update(order);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.orderService.delete(id);
	}
	

	
	

}
