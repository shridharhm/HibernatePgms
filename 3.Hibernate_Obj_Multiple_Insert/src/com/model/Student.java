package com.model;

public class Student 
{
	private int sid;
	private String name;
	private String email;
	private Adress school_ad;
	private Adress res_ad;
	
	
	
	public Adress getSchool_ad() {
		return school_ad;
	}
	public void setSchool_ad(Adress school_ad) {
		this.school_ad = school_ad;
	}
	public Adress getRes_ad() {
		return res_ad;
	}
	public void setRes_ad(Adress res_ad) {
		this.res_ad = res_ad;
	}
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
		return school_ad;
	}
	public void setAd(Adress ad) {
		this.school_ad = ad;
	}
	public Student(int sid, String name, String email, Adress ad) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.school_ad = ad;
		System.out.println("Student paramtere constructor called");
	}
	
	
	
	public Student(int sid, String name, String email, Adress school_ad, Adress res_ad) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.school_ad = school_ad;
		this.res_ad = res_ad;
	}
	public Student() {
		System.out.println("Student default constructor called");
	}
	
}
