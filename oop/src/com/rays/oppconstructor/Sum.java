package com.rays.oppconstructor;

public class Sum {
	
	public Sum() {
		System.out.println("this is undefind constructor");
	}
	public Sum(int a , int b) {
		
		System.out.println("sum:"+(a + b));
	}
	
public Sum(int a , int b , int c) {
	System.out.println("sum:"+(a+b+c));
}

public Sum(double a , double b , double c) {
	System.out.println("sum:"+(a+b+c));
	
}

public Sum (int a , int b , int c, int d) {
	System.out.println("sum four value: "+ (a+b+c+d));
}
}
