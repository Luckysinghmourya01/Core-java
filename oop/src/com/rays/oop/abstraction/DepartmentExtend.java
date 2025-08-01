package com.rays.oop.abstraction;

public class DepartmentExtend  implements Empolyes , Address , Department{

	@Override
	public void localaddress() {
		System.out.println("bhopal");
		
	}

	@Override
	public void permanentaddress() {
		System.out.println("indore");
		
	}
	
	@Override
	public void localaddress1() {
	System.out.println("mhow");
		
	}
	
	@Override
	public void permanentaddress1() {
		System.out.println("Pithampur");
		
	}

	@Override
	public void Getname() {
		System.out.println("mohan");
		
	}

	@Override
	public void getname() {
		System.out.println("ram");
		
	}

	@Override
	public void account() {
		System.out.println("Account Department");
		
	}

	@Override
	public void transport() {
		System.out.println("transport Incharge");
		
	}

	
	
	
}
