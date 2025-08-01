package com.rays.oop.polymorphism;

public class TestBankByMethodReturnType {

	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		
		b[0] = Bank.getBank(1);
		b[1] = Bank.getBank(2);
		b[2] = Bank.getBank(3);
		
		Sbi s = (Sbi)b[0];
		s.setname("abhimanyu");
		s.setAccno("999696579612");
		
		System.out.println("name: "+s.getName());
		System.out.println("Account no: "+s.getAccno());
		System.out.println("---------- Interest rate ---------");
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i].Name()+ " " + b[i].Interest());
		}
	}
}
