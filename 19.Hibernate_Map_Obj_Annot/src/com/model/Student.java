package com.model;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table
public class Student
{
	@Id
	@Column(name="SID",length=5)
	private int id;
	@Column(name="SName",length=15)
	private String name;
	@Column(name="S_College",length=15)
	private String college;

	@ElementCollection
	@MapKeyColumn(name="Key123")
	@JoinTable(name="Skills", joinColumns=@JoinColumn(name="test"))
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
