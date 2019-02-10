package com.model;

import java.util.Set;

public class Customer 
{
	private int id;
	private String name;
	private int salary;
	private Set<String> details;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Set<String> getDetails() {
		return details;
	}
	public void setDetails(Set<String> details) {
		this.details = details;
	}
	public Customer(int id, String name, int salary, Set<String> details) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.details = details;
		System.out.println("Customer parameter constructor called");
	}

	public Customer() {
		System.out.println("Customer default constructor called");
	}

}
