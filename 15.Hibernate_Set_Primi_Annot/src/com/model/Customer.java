package com.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Customer 
{
	@Id
	@Column(name="CID",length=5)
	private int id;
	@Column(name="CName",length=15)
	private String name;
	@Column(name="SAL",length=7)
	private int salary;
	
	@ElementCollection
	@JoinTable(name="Details",joinColumns=@JoinColumn(name="ID"))
	@Column(name="DetailSet")
	private Set<String> details_Set;
	
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
		return details_Set;
	}
	public void setDetails(Set<String> details) {
		this.details_Set = details;
	}
	public Customer(int id, String name, int salary, Set<String> details) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.details_Set = details;
		System.out.println("Customer parameter constructor called");
	}

	public Customer() {
		System.out.println("Customer default constructor called");
	}

}
