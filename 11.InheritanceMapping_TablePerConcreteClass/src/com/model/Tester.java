package com.model;

public class Tester extends Employee
{
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
