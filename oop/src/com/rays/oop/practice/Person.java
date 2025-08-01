package com.rays.oop.practice;

public class Person {

	private String Firstname;
	private String Lastname;
	
	public Person(String Firstname , String Lastname) {
		
		this.Firstname = Firstname;
		this.Lastname = Lastname;
	}
	
	@Override
	public String toString() {
		
		return Firstname+ " " + Lastname;
	}
	
}
