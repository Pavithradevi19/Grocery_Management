package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="products")

public class Product {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String categoryName;
	 private String name;
	 private int qty;
	 private double price;
	public Product() {
		super();
	}
	
	public Product(Long id, String categoryName, String name, int qty, double price) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", categoryName=" + categoryName + ", name=" + name + ", qty=" + qty + ", price="
				+ price + "]";
	}
	 

	 
}

