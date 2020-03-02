package com.emart;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hasa.onetomany.Cource;
import com.hasa.onetomany.Trainee;

@Entity
@Table(name="SubCategories")
public class SubCategories implements Comparable<SubCategories> {
	
	@Id
	private long subCategoryId;
	private String subCategoryName;
	
	@ManyToOne
	@JoinColumn(name="categotyId")
	private Category category;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="subCategories")
	private Set<Product> product;
	
	
	
	public SubCategories(long subCategoryId, String subCategoryName, Category category, Set<Product> product) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.category = category;
		this.product = product;
	}
	



	public long getSubCategoryId() {
		return subCategoryId;
	}




	public void setSubCategoryId(long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}




	public String getSubCategoryName() {
		return subCategoryName;
	}




	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}




	public Category getCategory() {
		return category;
	}




	public void setCategory(Category category) {
		this.category = category;
	}




	public Set<Product> getProduct() {
		return product;
	}




	public void setProduct(Set<Product> product) {
		this.product = product;
	}




	public int compareTo(SubCategories o) {
		
		return (this.subCategoryId<o.subCategoryId?-1:(this.subCategoryId>o.subCategoryId?1:0));
	}




	

}
