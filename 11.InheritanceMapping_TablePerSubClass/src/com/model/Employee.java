package com.model;

public class Employee 
{
	private int id;
	private String name;
	private String email;
	
	public Employee() {
	System.out.println("Employee default constructor called");
	}
	
	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		System.out.println("Employee Parametere constructor called");
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
