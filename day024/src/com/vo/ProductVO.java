package com.vo;

import java.util.Date;

public class ProductVO {
	private int id;
	private String name;
	private int price;
	private Date sysdate;
	private double rate;
	
	public ProductVO() {
	}

	public ProductVO(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public ProductVO(int id, String name, int price, Date sysdate, double rate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.sysdate = sysdate;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getSysdate() {
		return sysdate;
	}

	public void setSysdate(Date sysdate) {
		this.sysdate = sysdate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", price=" + price + ", sysdate=" + sysdate + ", rate=" + rate
				+ "]";
	}
	
	
}
