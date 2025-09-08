package com.rays.javaexception;

public class ThrowAndThrowsProgram {

	public static void main(String[] args) throws ArithmeticException {
		
		try {
			div(20 , 0);
		}catch(ArithmeticException e)
		{
			System.out.println("value of b is zero");
		}
	}
	
	
	public static void div(int a , int b)  {
		
		if(b == 0) {
			
			throw new ArithmeticException();
		}
		else {
		int	c = a/b;
			System.out.println("c= "+ c);
		}
	}
}
