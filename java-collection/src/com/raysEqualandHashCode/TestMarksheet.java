package com.raysEqualandHashCode;

public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet(105 , 89 );
		Marksheet m2 = new Marksheet(106 , 78);
		
		System.out.println(m1.equals(m2));
	}
}
