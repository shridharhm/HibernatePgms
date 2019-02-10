package com.model;

public class Adress 
{
	private String street;
	private String City;
	private String State;
	private String pincode;
	
	public Adress() {
		System.out.println("Adress default constructor called");
	}
	
	public Adress(String street, String city, String state, String pincode) {
		super();
		this.street = street;
		City = city;
		State = state;
		this.pincode = pincode;
		System.out.println("Adress paramtere constructor called");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
