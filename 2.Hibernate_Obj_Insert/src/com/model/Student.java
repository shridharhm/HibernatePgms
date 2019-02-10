package com.model;

public class Student 
{
	private int sid;
	private String name;
	private String email;
	private Adress ad;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Adress getAd() {
		return ad;
	}
	public void setAd(Adress ad) {
		this.ad = ad;
	}
	public Student(int sid, String name, String email, Adress ad) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.ad = ad;
		System.out.println("Student paramtere constructor called");
	}
	
	public Student() {
		System.out.println("Student default constructor called");
	}
	
}
