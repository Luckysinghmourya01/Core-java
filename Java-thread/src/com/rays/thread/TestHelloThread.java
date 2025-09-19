package com.rays.thread;

public class TestHelloThread {

	public static void main(String[] arg) {
		
		HelloThread t = new HelloThread("aman" , 101);
		HelloThread t1 = new HelloThread("kamal" , 102);
		HelloThread t2 = new HelloThread("piyush" , 103);
		
		t.setPriority(7);// scheduel priority
	
	 int i = t.getPriority(); // check priority
	System.out.println(i);
		t.start();
		t1.start();
		t2.start();
	}
}
