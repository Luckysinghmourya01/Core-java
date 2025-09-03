package com.rays.practicePolymorphism;

public class TestBankByArray {

	public static void main(String[] args) {
		
		Bank[] b1 = new Bank[2];
		
		b1[0] = new Sbi();
		b1[1] = new Hdfc();
		
		Sbi s = (Sbi)b1[0];
		s.setName("Aman");
		
		Hdfc h = (Hdfc)b1[1];
		h.setAccno("15524619911");
		
		System.out.println("name: "+ s.getName());
		System.out.println("accno: "+h.getAccno() );
		
		System.out.println("----------------home loan interest rate----------------");
		
		for(int i = 0; i<b1.length; i++) {
			
			System.out.println(b1[i].name()+ "=" + b1[i].interest());
		}
	}
}
