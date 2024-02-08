package com.secuirty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String passwaord;

	public Student() {
		super();
	}

	public Student(Integer id, String name, String email, String passwaord) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passwaord = passwaord;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswaord() {
		return passwaord;
	}

	public void setPasswaord(String passwaord) {
		this.passwaord = passwaord;
	}

	}
