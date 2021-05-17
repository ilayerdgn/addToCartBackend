package com.proje.addToCart.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proje.addToCart.entities.concretes.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{
	
}
