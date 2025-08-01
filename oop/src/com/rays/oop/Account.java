package com.rays.oop;

public class Account {

	private String number;
	private String type;
	private double balance;

	public void setnumber(String number) {
		this.number = number;
	}

	public String getnumber() {
		return this.number;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String gettype() {
		return this.type;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public double getbalance() { 
		return this.balance;
		
	}
	
	
	public void Deposit(double amount) {
		this.balance = this.balance + amount;
		
		System.out.println("total amount after deposit: "+this.balance);
	}
	
	public void Witdrawl(double amount) {
		if ( amount > this.balance) {
			System.out.println("enter sufficient funds");
		}
		
		else {
			this.balance = this.balance - amount;
			System.out.println("total amount after witdrawl: "+this.balance);
		}
	}
	}

	
	

