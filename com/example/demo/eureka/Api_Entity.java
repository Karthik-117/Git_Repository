package com.example.demo.eureka;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//If needed, you can customize the names using @Table(name="your_table")
@Entity
public class Api_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// you can customize the names using @Column(name="your_column").
	private String product;
	private int price;

	public Api_Entity() {

	}

	public Api_Entity(Long id, String Product, int Price) {
		this.id = id;
		this.product = Product;
		this.price = Price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
