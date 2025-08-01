package com.rays.oop.overriding;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Student();
		Student s = (Student)p;
		s.age();
		s.setName("lucky");
		
		System.out.println("name: "+s.getName());
		
	}

} 