 package com.rays.oop.abstraction;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Circle();
		
		 Circle c = (Circle)s;
		 c.setRadius(10);
		
		 System.out.println("radius: "+c.getRadius());
		 System.out.println("area of circle: "+s.area());
		 
		 Shape s1 = new Rcetangle();
		 Rcetangle r = (Rcetangle)s1;
		 
		 r.setLength(25);
		 r.setWidth(10);
		 
		 System.out.println("area of rectangle: "+s1.area());
	}
}
