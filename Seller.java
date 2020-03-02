package com.cts.emart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Sellers")
public class Seller {
	@Id
	@Column(name="sid")
	private int sellerId;
	
	@Column(name="sname")
	private String SellerName;
	
	
	@Column(name="pswd")
	private String pswd;
	
	@Column(name="bname")
	private String brandName;
	
	@Column(name="mno")
	private String mobileNumber;
	
	@OneToMany
	@JoinColumn(name="pid")
	private Products pid;

}
