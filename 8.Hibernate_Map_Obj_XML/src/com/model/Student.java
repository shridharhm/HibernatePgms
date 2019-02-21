package com.model;

import java.util.Map;


public class Student
{
	private int id;
	private String name;
	private String college;
	private Map<Integer,Adress> skills;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String college, Map<Integer,Adress> skills) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.skills = skills;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Map<Integer,Adress> getSkills() {
		return skills;
	}
	public void setSkills(Map<Integer,Adress> skills) {
		this.skills = skills;
	}
	
	
}
