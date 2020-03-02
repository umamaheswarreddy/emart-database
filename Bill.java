package com.emart;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Bill {
	
	@Id
	@Column(name="bill_id")
	private String billId;
	
	@Column(name="bill_date", nullable=false)
	private LocalDate billDate;

	public Bill() {
		
	}

	public Bill(String billId, LocalDate billDate) {
		super();
		this.billId = billId;
		this.billDate = billDate;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	
	
	
	

}
