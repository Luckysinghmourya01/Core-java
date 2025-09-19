package com.rays.thread;

public class AccountThread extends Thread {

	static Account a = new Account();
	
	private String name;
	
	public AccountThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=6; i++) {
		a.deposit(name, 1000);
		
		}
	
}
}
