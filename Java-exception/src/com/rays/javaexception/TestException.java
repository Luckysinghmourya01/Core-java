package com.rays.javaexception;

public class TestException {

public static void main(String[] args) {
	
	try {
		
		String name = "aman";
		System.out.println( name.length());
		System.out.println(name.charAt(5));
	} catch(NullPointerException e) {
		
		System.out.println("exception: "+ e.getMessage());
	}catch(IndexOutOfBoundsException e ) {
		
		System.out.println("exception= "+ e.getMessage());
	}
	
	
	System.out.println("Finish");
	}
	
}

