package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("tester")
public class Tester extends Employee
{
	@Column(length=25)
	private String testType;

	public Tester() {
		System.out.println("Tester default constructor called");
	}

	public Tester(int id, String name, String email, String testType) {
		super(id, name, email);
		this.testType = testType;
		System.out.println("Tester parameter constructor called");
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}


}
