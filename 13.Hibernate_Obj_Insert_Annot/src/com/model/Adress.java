package com.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adress 
{
	@Column(name="Raste",length=15)
	private String street;
	@Column(name="Ooru",length=25)
	private String City;
	@Column(name="Rajya",length=25)
	private String State;
	@Column(name="Code",length=6)
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
