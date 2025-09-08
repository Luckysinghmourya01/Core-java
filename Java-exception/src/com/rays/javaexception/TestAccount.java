package com.rays.javaexception;

import javax.naming.InsufficientResourcesException;

public class TestAccount {

	public static void main(String[] args) throws  InsufficientFund {
		
		double amount = 2000.0;
		System.out.println("total amount: "+ amount);
		double withdrawl = 5000.0;
		if(amount < withdrawl) {
			throw new InsufficientFund();
		}
		else {
			amount = amount - withdrawl;
			System.out.println("total amount after withdrawl: "+ amount);
			
		}
	}
}
