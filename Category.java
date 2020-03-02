package com.emart;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hasa.onetomany.Trainee;
@Entity
@Table(name="categories")
public class Category implements Comparable<Category>{
	
	@Id
	private long categotyId;
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<SubCategories> subCategories;

	public Category(long categotyId, String categoryName, Set<SubCategories> subCategories) {
		super();
		this.categotyId = categotyId;
		this.categoryName = categoryName;
		this.subCategories = subCategories;
	}

	public long getCategotyId() {
		return categotyId;
	}

	public void setCategotyId(long categotyId) {
		this.categotyId = categotyId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<SubCategories> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Set<SubCategories> subCategories) {
		this.subCategories = subCategories;
	}

	public int compareTo(Category o) {
		
		return (this.categotyId<o.categotyId?-1:(this.categotyId>o.categotyId?1:0));
	}
	
	
	
	
	

}
