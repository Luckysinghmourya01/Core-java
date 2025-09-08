package com.rays.javaexception;

public class ArithmaticException {

	public static void main(String[] args) {
		
		try {
			int a=10 , b=0;
			int c = a/b;
			
			System.out.println("c= "+ c);
		}catch(ArithmeticException e)
		{
		System.out.println("exception: "+ e.getMessage());	
		}
		
		System.out.println("program ended");
	}
	
}
  