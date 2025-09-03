package com.rays.oop.practiceconstructor;

public class TestPerson {

	public static void main(String[] args) {
		
		Student s = new Student("233BCAAIDA6460" , 8.9 , "oui");
		s.setName("lucky");
		System.out.println("name: "+s.getName());
		System.out.println("rollno: "+s.getRollno());
		System.out.println("marks: "+s.getMarks());
		System.out.println("collage: "+s.getCollage());
	}
}
