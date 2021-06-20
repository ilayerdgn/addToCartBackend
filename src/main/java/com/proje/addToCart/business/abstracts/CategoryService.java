package com.proje.addToCart.business.abstracts;

import java.util.List;

import com.proje.addToCart.entities.concretes.Category;

public interface CategoryService {
	
	List<Category> getAll();
	void add(Category category);
	Category update(Category category);
	void delete(int id);
	Category getById(int id);

}
