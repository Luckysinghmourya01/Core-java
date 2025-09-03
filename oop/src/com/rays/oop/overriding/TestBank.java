package com.rays.oop.overriding;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b = new Sbi();
		Sbi s = (Sbi)b;
		
		s.setName("aman");
		System.out.println("name: "+ s.getName());
		System.out.println("Bank name: "+ b.name());
		System.out.println("Interest rate: "+ b.interest());
	
		System.out.println("-------------------------------------------");
		 System.out.println("--------- Home Loan Interest Rate   ----------");
		 
		 
		Bank b1 = new Hdfc();
		Hdfc h = (Hdfc)b1;
		b1.setName("lucky");
		h.setAccno("155246199");
		
		System.out.println("name: "+ h.getName());
		System.out.println("acc no: "+ h.getAccno());
		System.out.println("Bank name: "+ b1.name());
		System.out.println("Interest rate: "+ b1.interest());
	}
}
