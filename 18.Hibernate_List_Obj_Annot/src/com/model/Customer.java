package com.model;

import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;
@Entity
@Table
public class Customer 
{
	@Id
	private int id;
	private String name;
	private int salary;
	@ElementCollection
	@JoinTable(name="Cust_Details_List",joinColumns=@JoinColumn(name="ID"))
	@IndexColumn(name = "test")
	private List<Adress> adrs;
	
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
	public List<Adress> getDetails() {
		return adrs;
	}
	public void setDetails(List<Adress> details) {
		this.adrs = details;
	}
	public Customer(int id, String name, int salary, List<Adress> details) {
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
