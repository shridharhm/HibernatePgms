package com.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

public class Student
{
	private int id;
	private String name;
	private String college;
	private Set<Adress> ads;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String college, Set<Adress> ads) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.ads = ads;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	public Set<Adress> getAds() {
		return ads;
	}

	public void setAds(Set<Adress> ads) {
		this.ads = ads;
	}
	
	
}
