package com.everis;


public class People {
	
	String name;
	String surname;
	Integer age;
	
	public String getName() {
		return name;
	}
	
	public People(String name, String surname, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public People() {
		super();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}