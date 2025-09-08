package com.rays.javaexception;

public class FamilPropagationUnchecked {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.rays.javaexception.FamilPropagationUnchecked");
	try {
		dad();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	public static void dad()  {
	mom();	
	}
	
	public static void mom()  {
	son();	
	}
	
	public static void son()  {
		
		System.out.println("hello");
			throw new RuntimeException("i make a mistake");
	}
}
