package com.example.demo.entities;

public class Product {
	private Long id;
	private String name;
	private Float price;
	private Department department;
	
	public Product() {
		
	}

	public Product(Long id, String name, Float price, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
