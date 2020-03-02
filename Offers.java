

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="offers")
public class Offers {
	@Id
	@Column(name="offer_id")
	private  long  offer_id;
	
	@Column(name="offerName",nullable=false)
	private String  offerName;
	
	@Column (name="Startdate",nullable=false)
	private  LocalDate startdate;
	
	@Column(name="discount_rate")
	private double discount_rate;

	@Column (name="Enddate",nullable=false)
	private  LocalDate enddate;
	
	@JoinColumn (name="product_id")
	private Product product;
	
	@JoinColumn(name="shop_id")
	private Shop shop;

	public Offers() {
		super();
	}

	public Offers(long offer_id, String offerName, LocalDate startdate, double discount_rate, LocalDate enddate,
			Product product, Shop shop) {
		super();
		this.offer_id = offer_id;
		this.offerName = offerName;
		this.startdate = startdate;
		this.discount_rate = discount_rate;
		this.enddate = enddate;
		this.product = product;
		this.shop = shop;
	}

	public long getOffer_id() {
		return offer_id;
	}

	public void setOffer_id(long offer_id) {
		this.offer_id = offer_id;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public double getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(double discount_rate) {
		this.discount_rate = discount_rate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	
	
	
}
