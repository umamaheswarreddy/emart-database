package com.emart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@Column(name="cart_id")
	private String cartId;
	
	@Column(name="quantity")
	private int qty;

	public Cart() {
		
	}

	public Cart(String cartId, int qty) {
		super();
		this.cartId = cartId;
		this.qty = qty;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	

}
