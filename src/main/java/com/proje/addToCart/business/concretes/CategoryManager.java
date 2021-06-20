package com.proje.addToCart.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proje.addToCart.business.abstracts.CategoryService;
import com.proje.addToCart.dataAccess.abstracts.CategoryDao;
import com.proje.addToCart.entities.concretes.Category;
import com.proje.addToCart.entities.concretes.Product;


@Service
public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;
	

	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	@Transactional
	public List<Category> getAll() {
		return categoryDao.findAll() ;
	}

	@Override
	@Transactional
	public void add(Category category) {
		Category _category=new Category();
		_category.setCategoryName(category.getCategoryName());
		
		categoryDao.save(category);
		
	}

	@Override
	@Transactional
	public Category update(Category category) {
		Integer rollNumber=category.getCategoryId();
		Category _category =categoryDao.findById(rollNumber).get();
		_category.setCategoryName(category.getCategoryName());
		return categoryDao.save(_category);
	}

	@Override
	@Transactional
	public void delete(int id) {

		categoryDao.deleteById(id);
	}

	@Override
	@Transactional
	public Category getById(int id) {
		return categoryDao.getOne(id);
	}

}
