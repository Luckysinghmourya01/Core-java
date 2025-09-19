package com.rays.thread;

public class TestRunnabel {

	public static void main(String[] args) {
		
		Thread t = new Thread(new RunnableThread("amit" , 90));
		Thread t1 = new Thread(new RunnableThread("aman" , 80));
		
		t.start();
		t1.start();
		
		
	}
}
