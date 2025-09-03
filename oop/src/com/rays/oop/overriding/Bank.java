package com.rays.oop.overriding;

public class Bank {

	protected String name;
	protected double interest;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public static Bank getBank(int i) {
		if (i == 1) {
			return new Sbi();
		}
		if( i == 2) {
			return new Hdfc();
		}
		return new Bank();
	}
}
