package com.rays.multipletrycatch;

public class NestedTryBlock {

	public static void main(String[] args) {
		
		
		try {
			int a=10 , b=2;
			int c=a/b;
			System.out.println(c);
			
			try {
				String name = "mohan";
				System.out.println(name.charAt(5));
				System.out.println(name.length());			
				
		} catch(IndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
		}
				
		}catch(ArithmeticException e) {
		
			System.out.println(e.getMessage());
		}
	}
}
