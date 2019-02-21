package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Info")
public class Student 
{
	@Id
	@Column(name="StudentID", length=10)
	private int id;
	@Column(name="StudentName", length=20)
	private String name;
	@Column(name="StudentEmail", length=20)
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		System.out.println("Student Parameter constructor called");
	}
	
	public Student() {
	System.out.println("Student Default constructor called");
	}
	
	
}
