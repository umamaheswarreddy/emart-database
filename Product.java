package com.emart;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product implements Comparable<Product> {
	@Id
	private double productId;
	private double price;
	private String productName;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="subCategoryId")
	private SubCategories subCategories;

	public Product(double productId, double price, String productName, String description,
			SubCategories subCategories) {
		super();
		this.productId = productId;
		this.price = price;
		this.productName = productName;
		this.description = description;
		this.subCategories = subCategories;
	}

	public double getProductId() {
		return productId;
	}

	public void setProductId(double productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SubCategories getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(SubCategories subCategories) {
		this.subCategories = subCategories;
	}

	public int compareTo(Product o) {
		
		return (this.productId<o.productId?-1:(this.productId>o.productId?1:0));
	}
	
	
	
	
	

}
