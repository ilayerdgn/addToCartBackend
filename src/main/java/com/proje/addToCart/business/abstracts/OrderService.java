package com.proje.addToCart.business.abstracts;

import java.util.List;

import com.proje.addToCart.entities.concretes.Order;

public interface OrderService {

	List<Order> getAll();
	void add(Order order);
	void update(int id, Order Order);
	void delete(int id);
	Order getById(int id);
}
