package com.cts.emart.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {

	@Id
	@Column(name="cid")
	private int customerId;
	
	@Column(name="cname",nullable=false)
	private String customerName;
	
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="cDetails")
	private ContactDetails contactDetails ;
	
//	@Column(name="cdate")
//	private LocalDate created_date;
	

	@OneToMany(cascade=CascadeType.ALL,mappedBy="products")
	@OneToMany(cascade=CascadeType.ALL,mappedBy="orders")
	@OneToMany(cascade=CascadeType.ALL,mappedBy="bills")
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	
	public Customer() {
		super();
	}
	

	public Customer(int customerId, String customerName, String pwd, ContactDetails contactDetails) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.pwd = pwd;
		this.contactDetails = contactDetails;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public ContactDetails getContactDetails() {
		return contactDetails;
	}


	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	

	
	}
	

}
