package com.rays.multipletrycatch;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			int a=10, b=2;
			int c= a/b;
			System.out.println(c);
		}catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());	
		}
		
		try {
			String name="abhimanyi";
			System.out.println(name.charAt(6));
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
