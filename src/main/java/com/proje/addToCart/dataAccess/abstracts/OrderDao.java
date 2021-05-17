package com.proje.addToCart.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proje.addToCart.entities.concretes.Order;

public interface OrderDao extends JpaRepository<Order,Integer>{

}
