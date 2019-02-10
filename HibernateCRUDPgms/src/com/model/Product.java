package com.model;

public class Product
{
	private int pid;
	private String category;
	private int price;
	private String pname;
	private String city;
	
	
	public Product() {
	System.out.println("Product default constructor called");
	}
	
	public Product(int pid, String category, int price, String pname, String city) {
		super();
		this.pid = pid;
		this.category = category;
		this.price = price;
		this.pname = pname;
		this.city = city;
		System.out.println("Prodct parameter constructor called");
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
