package com.proje.addToCart.business.abstracts;

import java.util.List;

import com.proje.addToCart.entities.concretes.Product;

public interface ProductService {

	List<Product> getAll();
	void add(Product product);
	Product update(Product product);
	void delete(int id);
	Product getById(int id);


}
