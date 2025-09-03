package com.rays.cnstr;

public class Person {
	
	public Person() {
	}

	private String Name;
	private String age;
	
	
	public Person(String name , String age) {
		this.Name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return this.Name;
	}
	
	public String getAge() {
		return this.age;
	}
}

