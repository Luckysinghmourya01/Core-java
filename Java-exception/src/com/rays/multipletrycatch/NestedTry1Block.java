package com.rays.multipletrycatch;

public class NestedTry1Block {

	public static void main(String[] args) {
		
		try {
			
			try {
				
				int a[] = {10 , 20 , 30 , 40 , 50};
				System.out.println(a[5]);
				}
			catch(ArrayIndexOutOfBoundsException
					e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(10/0);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

