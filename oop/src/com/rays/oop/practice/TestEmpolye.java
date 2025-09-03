package com.rays.oop.practice;

public class TestEmpolye {

	public static void main(String[] args) {
		
		EmployeExtend e = new EmployeExtend();
		System.out.println("------- Account Department ---------");
		System.out.print("Name: ");
		e.name1();
		System.out.print("Department= ");
		e.account();
		System.out.print("LocalAddress: ");
		e.localaddress();
		System.out.print("permanentaddress: ");
		e.permanentaddress();
		
		System.out.println("--------- Trasfer Department ----------");
		
		System.out.print("Name: ");
		e.name2();
		System.out.print("Department: ");
		e.transfer();
		System.out.print("Permanentaddress: ");
		e.permanentaddress();
	}
}
