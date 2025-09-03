package com.rays.cnstr;

public class Student extends Person {

	private String rollno;
	private int marks;
	
	public Student(String name , String age, String rollno, int marks  ) {
		super(name, age);
		this.marks = marks;
		this.rollno = rollno;
	}
	
	
	public int getMarks() {
		return this.marks;
	}
	
	public String getRollno() {
		return this.rollno;
	}
}
