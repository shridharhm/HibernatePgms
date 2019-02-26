package com.model;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
@Entity
@Table
public class Customer 
{
	@Id
	private int id;
	private String name;
	private int salary;
	@ElementCollection
	@JoinTable(name="Cust_Details_Set",joinColumns=@JoinColumn(name="ID"))
	private Set<Adress> adrs;
	
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
	public Set<Adress> getDetails() {
		return adrs;
	}
	public void setDetails(Set<Adress> details) {
		this.adrs = details;
	}
	public Customer(int id, String name, int salary, Set<Adress> details) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.adrs = details;
		System.out.println("Customer parameter constructor called");
	}

	public Customer() {
		System.out.println("Customer default constructor called");
	}

}
