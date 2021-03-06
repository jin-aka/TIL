package com.vo;

public class ItemVO {
	private String name;
	private String price;
	private String code;
	public ItemVO() {
	}
	public ItemVO(String name, String price, String code) {
		this.name = name;
		this.price = price;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ItemVO [name=" + name + ", price=" + price + ", code=" + code + "]";
	}
	
	
}
