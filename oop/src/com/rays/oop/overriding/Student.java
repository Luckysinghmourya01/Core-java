package com.rays.oop.overriding;

public class Student extends Person{
	
	 private String name;
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 @Override
	public String age() {
	System.out.println("hello student");
		return "age";
	}
}
