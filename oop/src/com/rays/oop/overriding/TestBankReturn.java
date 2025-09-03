package com.rays.oop.overriding;

public class TestBankReturn {

	public static void main(String[] args) {
		
		Bank[] b = new Bank[2];
		
		b[0] = Bank.getBank(1);
		b[1] = Bank.getBank(3);
		
		b[0].setName("Sbi");
		b[0].setInterest(7.5);
		
		b[1].setName("Hdfc");
		b[1].setInterest(10.75);
		
		for(int i= 0; i<b.length; i++) {
			System.out.println(b[i].getName()+ "=" + b[i].getInterest());
		}
	}

	
}
