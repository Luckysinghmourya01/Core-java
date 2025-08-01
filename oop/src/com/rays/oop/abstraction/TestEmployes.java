package com.rays.oop.abstraction;

public class TestEmployes {
	
	public static void main(String [] args) {
		
		DepartmentExtend de = new DepartmentExtend();
		System.out.println("-------Account Department------------");
		System.out.print("name= ");
		//de.getname();
		System.out.print("Department= ");
		de.account();
		System.out.print("local address= ");
		de.localaddress();
		System.out.print("permanent address= ");
		de.permanentaddress();
		
		System.out.println("-----------Transport-------------");
		System.out.print("Name= ");
		de.Getname();
		System.out.print("department= ");
		de.transport();
		System.out.print("permanent address= ");
		de.permanentaddress1();
		
		
	}

}
 