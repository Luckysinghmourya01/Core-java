package com.rays.constructorcalling;

public class Student {

	public Student() {
		System.out.println("this is default constructor");
	}
	
	public Student(String name) {
		this();
		System.out.println("name: "+ name);
	}
	
	public Student(String name , String address) {
		this(name);
		System.out.println("address: "+ address);
	}
	
	public Student (String name , String address , String subject) {
		
		this(name, address);
		System.out.println("subject: "+ subject);
	}
}
