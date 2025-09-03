package com.rays.oop.practiceconstructor;

public class Student extends Person{

	private String rollno;
	private double marks;
	private String collage;
	 
	public Student(String rollno , double marks , String collage) {
		this.rollno = rollno;
		this.marks = marks;
		this.collage = collage;
	}
	
	public String getRollno() {
		return this.rollno;
	}
	
	public double getMarks() {
		return this.marks;
	}
	
	public String getCollage() {
		return this.collage; 
	}
}
