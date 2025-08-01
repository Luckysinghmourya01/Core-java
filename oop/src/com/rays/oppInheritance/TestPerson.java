package com.rays.oppInheritance;

public class TestPerson {

	public static void main(String[] args)
	{
		Student s= new Student();
		s.setName("lucky");
		s.setAge(19);
		s.setAddress("pithampur");
		s.setBranch("cs[computer sicence]");
		s.setRollno(233046);
		s.setMarks(81.99);
		
		System.out.println("name: "+s.getName());
		System.out.println("age:= "+s.getAge());
		System.out.println("address: "+s.getAddress());
		System.out.println("brach: "+s.getBranch());
		System.out.println("rollno: "+s.getRollno());
		System.out.println("marks: "+s.getMarks());
		
		System.out.println("------------ doctor     ");
		
		Doctor D = new Doctor(); 
		D.setName("Dr.shukla");
		D.setAge(55);
		D.setSpecilist("bones");
		D.setSurgery("HEART");
		
		
		
		System.out.println(D.getName());
		System.out.println("age: "+D.getAge());
		System.out.println(D.getSpecilist());
		System.out.println(D.getSurgery());
		
		System.out.println("-------------bussines man-------------");
		
		BussinesMan b = new BussinesMan();
		 b.setName("honey singhania");
		 b.setAddress("mumbai");
		 b.setInvest(1000000.0);
		 b.setIncome(200000);
		 b.setNetwork("10cr");
		 
		 System.out.println("name: "+b.getName());
		 System.out.println("address: "+b.getAddress());
		 System.out.println("total investment: "+b.getInvest());
		 System.out.println("income: "+b.getIncome());
		 System.out.println("total network: "+b.getNetwork());
		
	}
}
