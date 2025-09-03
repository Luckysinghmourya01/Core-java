package com.rays.constructorcalling;

public class Student1 extends person {

	private String marks;
	

	public Student1(String name , String age , String marks) {
		super(name, age);
		this.marks = marks;
	}
	

	
public String getMarks() {
	return this.marks;

	}

}
