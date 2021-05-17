package com.proje.addToCart.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proje.addToCart.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

}
