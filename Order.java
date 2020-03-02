import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@Column(name="order_id")
	private  long  order_id;
	
	
	@Column (name="orderdate",nullable=false)
	private  LocalDate orderdate;
	
	@Column (name="delivery_address",nullable=false)
	private  String delivery_address;
	
	@Column (name="pay_type",nullable=false)
	private String Pay_type;
	
	@Column (name="totalAmount")
	private double totalAmount;
	
	@JoinColumn (name="buyer_id")
	private Buyer buyer;
	
	@JoinColumn (name="cart_id")
	private Cart cart;
	
	@JoinColumn (name="mobile_no")
	private Buyer buyer;
	
	

	public Order() {
		super();
	}

	public Order(long order_id, LocalDate orderdate, String delivery_address, String pay_type, double totalAmount,
			Buyer buyer, Cart cart) {
		super();
		this.order_id = order_id;
		this.orderdate = orderdate;
		this.delivery_address = delivery_address;
		Pay_type = pay_type;
		this.totalAmount = totalAmount;
		this.buyer = buyer;
		this.cart = cart;
	}

	public long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getPay_type() {
		return Pay_type;
	}

	public void setPay_type(String pay_type) {
		Pay_type = pay_type;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	
	
	
}
