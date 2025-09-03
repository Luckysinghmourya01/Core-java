package com.rays.oop.overriding;

public class TestBankPoly {

	public static void main(String[] args) {

		Bank[] b = new Bank[2];

		b[0] = new Sbi();
		b[1] = new Hdfc();

		b[0].setName("SBI");
		b[0].setInterest(2.3);
		b[1].setName("HDFC");
		b[1].setInterest(4.2);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].getName() + " " + b[i].getInterest());
		}
	}
}
