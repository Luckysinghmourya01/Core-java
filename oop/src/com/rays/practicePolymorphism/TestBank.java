package com.rays.practicePolymorphism;

public class TestBank {
	
public static void main(String[] args) {
	
	Bank[] b2 = new Bank[2];
			
	b2[0] = new Sbi();
	b2[1] = new Hdfc(); 
	
	System.out.println("home loan interest rate");
	String name = TestBankMethodArrgument.calbank(b2);
	
}
}
