package com.rays.oop.practice;

public class TestPersonInheritance {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Abhimanyu");
		s.setAddress("jaipur");
		s.setAge(20);
		s.setRollno("233BCAAIDA6460");
		s.setMarks(7.9);
	
		
		System.out.println("name: "+s.getName());
		System.out.println("address: "+s.getAddress());
		System.out.println("age: "+s.getAge());
		System.out.println("Roll no: "+s.getRollno());
		System.out.println("marks: "+ s.getMarks());
		
		System.out.println("---------- It Student--------------");
		
		ItStudent sd = new ItStudent("Software developer");
		sd.setName("Lucky");
		sd.setAddress("pithmapur");
		sd.setAge(19);
		//sd.setCreate("software");
		System.out.println("Name: "+sd.getName());
		System.out.println("address: "+ sd.getAddress());
		System.out.println("age: "+ sd.getAge());
		System.out.println("create: "+ sd.getCreate());
		
		System.out.println("-------------- Mechanical Student------------- ");
		
		MechanicalStudent mc =  new MechanicalStudent();
		
		mc.setName("mohan");
		mc.setAddress("mhow");
		mc.setRollno("233BCA0156");
		mc.setMake("Rider Bike and Racing car");
		
		System.out.println("name: "+ mc.getName());
		System.out.println("address: "+mc.getAddress());
		System.out.println("roll no: "+ mc.getRollno());
		System.out.println("make: "+mc.getMake());
	}
}
 