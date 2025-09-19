package com.rays.thread;

public class Account {

	private int balance;
	
	public void setBalance(int balance) {
		this.balance  = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public synchronized  void deposit(String name , int amt) {
		int bal = getBalance();
		bal = bal + amt;
		setBalance(bal);
		
		System.out.println(name + "=" + getBalance());
	}
}
