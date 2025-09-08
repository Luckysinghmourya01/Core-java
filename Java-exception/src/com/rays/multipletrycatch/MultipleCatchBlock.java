package com.rays.multipletrycatch;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		try {
			int a=10 , b=2;
			int c = a/b;
			System.out.println(c);
			
			String name = "aman";
			String str = null;
			System.out.println(name.charAt(2));
			System.out.println(str.length());
		}catch(ArithmeticException e)
		{
			System.out.println("exception: "+ e.getMessage());
		}
		
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}


