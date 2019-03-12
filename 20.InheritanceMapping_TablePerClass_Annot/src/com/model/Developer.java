package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Developer")
public class Developer extends Employee
{
	@Column(name="TechStack",length=25)
	private String progLang;
	@Column(name="Tool",length=25)
	private String ide;

	public Developer() {
		System.out.println("Developer default constructor called");
	}

	
	
	public Developer(int id, String name, String email, String progLang, String ide) {
		super(id, name, email);
		this.progLang = progLang;
		this.ide = ide;
		System.out.println("Developer parameter constructor called");
	}

	public String getProgLang() {
		return progLang;
	}
	public void setProgLang(String progLang) {
		this.progLang = progLang;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}


}
