package com.proje.addToCart.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proje.addToCart.business.abstracts.ProductService;
import com.proje.addToCart.dataAccess.abstracts.ProductDao;
import com.proje.addToCart.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return productDao.findAll();
	}

	@Override
	@Transactional
	public void add(Product product) {
		Product _product =new Product();
		_product.setCategoryId(product.getCategoryId());
		_product.setProductName(product.getProductName());
		_product.setUnitPrice(product.getUnitPrice());
		_product.setUnitsInStock(product.getUnitsInStock());
		
		productDao.save(product);
		
	}

	@Override
	@Transactional
	public Product update(Product product) {
		Integer rollNumber=product.getProductId();
		Product _product =productDao.findById(rollNumber).get();
		_product.setCategoryId(product.getCategoryId());
		_product.setProductName(product.getProductName());
		_product.setUnitPrice(product.getUnitPrice());
		_product.setUnitsInStock(product.getUnitsInStock());
		return productDao.save(product);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productDao.deleteById(id);
	}

	@Override
	@Transactional
	public Product getById(int id) {
		return productDao.findById(id).orElseThrow();
	}

}
