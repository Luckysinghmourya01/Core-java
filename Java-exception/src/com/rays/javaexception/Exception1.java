package com.rays.javaexception;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
			
			String name ="piyush";
			
			System.out.println("length: "+ name.length());
			System.out.println(name.charAt(8));
		}catch(IndexOutOfBoundsException e) {
			
			System.out.println("exception: "+ e.getMessage());
		}
		
		catch( NullPointerException e)
		{
		System.out.println("exception1: "+ e.getMessage());	
		}
		finally{ 
			
			System.out.println("always excuteable");
			
		}
	}
}
