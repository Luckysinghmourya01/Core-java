package com.rays.oop.practice;

public class EmployeExtend implements Employes , Department , Address {

	@Override
	public void localaddress() {
		System.out.println("indore");
		
	}

	@Override
	public void permanentaddress() {
		System.out.println("Bhopal");
		
	}

	@Override
	public void account() {
		System.out.println("Account department");
		
	}

	@Override
	public void transfer() {
		System.out.println("transfer department");
	}

	@Override
	public void name1() {
		System.out.println("mohit");
		
	}

	@Override
	public void name2() {
		System.out.println("Abhimanyu");
		
	}

}
