package com.rays.oop.polymorphism;

public class Bank {
	
	public double Interest() {
		return 0.0;
	}
	 
	public String Name() {
		return "RBI";
	}
	
	public static Bank getBank(int i) {
		if(i == 1) {
			return new Sbi();
		}
		if(i == 2) {
			return new Hdfc();
		}
		
		if( i == 3) {
			return new Axis();
		}
		
		return new Bank();
	}

}
