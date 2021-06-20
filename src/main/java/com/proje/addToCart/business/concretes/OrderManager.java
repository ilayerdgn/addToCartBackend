package com.proje.addToCart.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.proje.addToCart.business.abstracts.OrderService;
import com.proje.addToCart.dataAccess.abstracts.OrderDao;
import com.proje.addToCart.entities.concretes.Order;
import com.proje.addToCart.entities.concretes.Product;

@Service
public class OrderManager implements OrderService {
	
	private OrderDao orderDao;
	
	@Autowired
	public OrderManager(OrderDao orderDao) {
		super();
		this.orderDao=orderDao;
	}
	

	@Override
	public List<Order> getAll() {
		return orderDao.findAll();
	}

	@Override
	@Transactional
	public void add(Order order) {
		Order _order=new Order();
		_order.setEmployeeId(order.getEmployeeId());
		_order.setCustomerId(order.getCustomerId());
		_order.setOrderDate(order.getOrderDate());
		_order.setShipCity(order.getShipCity());
		orderDao.save(_order);

		
	}

	@Override
	@Transactional
	public Order update(Order order) {
		Integer rollNumber=order.getOrderId();
		Order _order =orderDao.findById(rollNumber).get();
		_order.setEmployeeId(order.getEmployeeId());
		_order.setCustomerId(order.getCustomerId());
		_order.setOrderDate(order.getOrderDate());
		_order.setShipCity(order.getShipCity());
		return orderDao.save(_order);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		orderDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public Order getById(int id) {
		return orderDao.getOne(id);
	}
	
}
