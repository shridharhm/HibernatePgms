package com.model;

import java.util.List;

import javax.persistence.Column;
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
	@Column(name="DetailList", length=15)
	private List<String> details_list;
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
	public List<String> getDetails() {
		return details_list;
	}
	public void setDetails(List<String> details) {
		this.details_list = details;
	}
	public Customer(int id, String name, int salary, List<String> details) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.details_list = details;
		System.out.println("Customer parameter constructor called");
	}

	public Customer() {
		System.out.println("Customer default constructor called");
	}

}
