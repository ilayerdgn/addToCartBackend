package com.proje.addToCart.business.concretes;

import java.util.List;

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
	public void update(int id, Product product) {
		Product _product=productDao.getOne(id);
		_product.setCategoryId(product.getCategoryId());
		_product.setProductName(product.getProductName());
		_product.setUnitPrice(product.getUnitPrice());
		_product.setUnitsInStock(product.getUnitsInStock());
		productDao.save(product);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productDao.deleteById(id);
	}

	@Override
	@Transactional
	public Product getById(int id) {
		
		return productDao.getOne(id);
	}

}
