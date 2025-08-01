package com.rays.oop.practice;

public class TestShapeByMethodArrgument {

	public static double getArea(Shape[]s) {
		double totalarea = 0.0;
		
		for(int i=0;  i<s.length; i++) {
			
			System.out.println("area= "+s[i].area());
			
			totalarea = totalarea + s[i].area();
		}
		return  totalarea;
	}
	
	
}
