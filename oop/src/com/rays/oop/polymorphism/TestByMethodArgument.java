 package com.rays.oop.polymorphism;

public class TestByMethodArgument {
	
	public static double getArea(Shape[]s) {
		double totalarea = 0.0;
		
		for(int i=0; i<s.length; i++) {
			
			System.out.println("area: " +s[i].area());
			totalarea = totalarea + s[i].area();
			
		}
		return totalarea;
	}

}
