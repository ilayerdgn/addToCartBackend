package com.proje.addToCart.entities.concretes;

import javax.persistence.*;
@Entity
@Table(name="Products")

public class Product {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	
	@Column(name="categoryId")
	private int categoryId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="unitsInStock")
	private int unitsInStock;
	
	@Column(name="unitPrice")
	private int unitPrice;
	
	public Product() {
		
	}
	public Product(int productId, int categoryId, String productName, int unitsInStock, int unitPrice) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	

}
