package com.proje.addToCart.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proje.addToCart.business.abstracts.ProductService;
import com.proje.addToCart.entities.concretes.Product;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Product product) {
	
		this.productService.add(product);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Product product) {
		this.productService.update(id,product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.productService.delete(id);
	}
	

}
