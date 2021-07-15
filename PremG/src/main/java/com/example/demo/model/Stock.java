package com.example.demo.model;

import java.sql.Date;

public class Stock {

	private Integer id;
	private String category;
	private String stockname;
	private Integer quantity;
	private Integer baseprice;
	private Integer profit;
	private Date expirydate;
	
	public Stock() {
		
	}
	public Stock(Integer id, String category, String stockname, Integer quantity, Integer baseprice, Integer profit,
			Date expirydate) {
		super();
		this.id = id;
		this.category = category;
		this.stockname = stockname;
		this.quantity = quantity;
		this.baseprice = baseprice;
		this.profit = profit;
		this.expirydate = expirydate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(Integer baseprice) {
		this.baseprice = baseprice;
	}
	public Integer getProfit() {
		return profit;
	}
	public void setProfit(Integer profit) {
		this.profit = profit;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	
}
