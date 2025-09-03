package com.rays.cnstr;

public class TestPerson {

	public static void main(String[] args) {
		
		Student s = new Student("lucky", "19", "233CAA046", 75);
		
		System.out.println("name: "+s.getName());
		System.out.println("age: "+ s.getAge());
		System.out.println("rollno: "+ s.getRollno());
		System.out.println("marks: "+s.getMarks());
		
		System.out.println("--------------- Bussinessman----------");
		
		Bussinessman b = new Bussinessman("sahid kapoor" , "56" , "10cr" , "2cr/m");
		
		System.out.println("name: "+ b.getName());
		System.out.println("age: "+ b.getAge());
		System.out.println("invest: "+ b.getInvest());
		System.out.println("income: "+ b.getIncome());
		
		System.out.println("----------- Doctor----------");
		
		Doctor d = new Doctor("viviek Dubey", "55" , "heart");
		
		System.out.println("name: "+ d.getName());
		System.out.println("age: "+ d.getAge());
		System.out.println("surgery: "+ d.getSurgery());
		
		
	}
	
	
}
