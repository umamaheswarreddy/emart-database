package com.emart;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {
	@Id
	@Column(name="Payment_ID")
	private String payId;
	
	@JoinColumn(name="order_id")
	private Order order;
	
	@JoinColumn(name="Total Amount")
	private Order order;

	@ManyToOne
	@JoinColumn(name="cid")
	private Customer customer;
	
	public Payment() {

	}

	public Payment(String payId, String orderId, double amount, String payMethod) {
		super();
		this.payId = payId;
		this.orderId = orderId;
		this.amount = amount;
		this.payMethod = payMethod;
	}

	
	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	
	
	
}
