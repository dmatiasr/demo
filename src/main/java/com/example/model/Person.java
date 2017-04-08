package com.example.model;

import java.util.UUID;

public class Person {
	private String id;
	private String name;
	private String email;
	
	public Person(){
		
	}
	public Person(String name, String email){
		this.id= UUID.randomUUID().toString();
		this.name=name;
		this.email=email;
	}
	public String getId() {
		return id;
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
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
