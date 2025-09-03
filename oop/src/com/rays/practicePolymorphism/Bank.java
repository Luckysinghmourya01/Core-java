package com.rays.practicePolymorphism;

public class Bank {

	
	public String name() {
		return"RBI";
	}
	
	public double interest() {
		return 7.25;
	}
	
	public static Bank getBank(int i) {
		if( i == 1) {
			return new Sbi();
		}
		
		if( i == 2) {
			return new Hdfc();
		}
		
		return new Bank();
	}
}
