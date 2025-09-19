package com.rays.thread;

public class TestAccount {

	public static void main(String[] args) {
		
	
	AccountThread t1 = new AccountThread("aman");
	AccountThread t2 = new AccountThread("shyam");
	
	
	
	t1.start();
	t2.start();
	
	
	
	}	
}
