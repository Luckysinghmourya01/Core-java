package com.rays.javaexception;

public class ThrowsException {

	public static void main(String[] args) throws InterruptedException  {
		
		for(int i = 1; i<=10; i++) {
			Thread.sleep(1000);
			
			System.out.println(i);
		}
	}
}
