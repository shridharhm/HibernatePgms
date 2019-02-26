package com.model;

public class Employee 
{
	private int id;
	private String name;
	private String email;
	private String department;
	
	public Employee() {
		System.out.println("Employee default constructor called");
	}
		
	public Employee(int id, String name, String email, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		System.out.println("Employee Prameter constructor called");
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public void showEmpInfo()
	{
		System.out.println("Employee id is "+this.id+" and his name is "+this.name + "and his email is "+this.email);
	}
	
	
}
