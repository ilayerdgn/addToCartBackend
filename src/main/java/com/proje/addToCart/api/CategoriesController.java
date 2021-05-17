package com.proje.addToCart.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proje.addToCart.business.abstracts.CategoryService;
import com.proje.addToCart.entities.concretes.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
	
	private CategoryService categoryService;

	@Autowired
	public CategoriesController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping("/getall")
	public List<Category> getAll(){
		return this.categoryService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Category category) {
	
		this.categoryService.add(category);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Category category) {
		this.categoryService.update(id,category);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.categoryService.delete(id);
	}
	
	


}
