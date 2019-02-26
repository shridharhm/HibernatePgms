package com.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Info")
public class Student 
{
	@Id
	@Column(name="SId",length=5)
	private int sid;
	@Column(name="SName",length=25)
	private String name;
	@Column(name="SEmail",length=25)
	private String email;

	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="S_Road",length=10)),
		@AttributeOverride (name="State", column=@Column(name="S_State",length=15)),
		@AttributeOverride(name="City", column=@Column(name="S_City",length=15)),
		@AttributeOverride(name="pincode", column=@Column(name="S_Code",length=15)),
		})
	private Adress school_ad;
	private Adress home_ad;
	
	
	public Adress getAd1() {
		return school_ad;
	}
	public void setAd1(Adress ad1) {
		this.school_ad = ad1;
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
	public Student(int sid, String name, String email, Adress ad1,Adress ad2) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.school_ad = ad1;
		this.home_ad = ad2;
		System.out.println("Student paramtere constructor called");
	}
	
	public Student() {
		System.out.println("Student default constructor called");
	}
	
}
