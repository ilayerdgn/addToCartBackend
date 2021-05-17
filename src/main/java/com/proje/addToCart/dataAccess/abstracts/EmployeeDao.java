package com.proje.addToCart.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proje.addToCart.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
