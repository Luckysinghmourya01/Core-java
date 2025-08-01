package com.rays.oop.polymorphism;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		
		b[0] = new Sbi();
		b[1] = new Hdfc();
		b[2] = new Axis();
		
		Sbi s = (Sbi)b[0];
		s.setname("aman");
		s.setAccno("255199197"); 
		
		System.out.println("name: "+s.getName());
		System.out.println("acc.no: "+ s.getAccno());
		
		System.out.println("------------- this Bank Interest Rate [Home Loan]--------------");
		
		for(int i=0; i<b.length; i++) {
			
			System.out.println(b[i].Name()+ "=" + b[i].Interest());		}
	}

}
