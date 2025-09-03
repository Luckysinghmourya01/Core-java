package com.rays.practicePolymorphism;

public class TestBankReturn {
 public static void main(String[] args) {
	 
	 Bank[] b = new Bank[2];
	 
	 b[0] = Bank.getBank(1);
	 b[1] = Bank.getBank(2);
	 System.out.println("---- home loan interest rate---------");
	 for(int i = 0; i<b.length; i++) {
		 
		 System.out.println(b[i].name()+ "=" + b[i].interest());
	 }
 }
}
