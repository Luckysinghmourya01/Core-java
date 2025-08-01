package com.rays.oop.polymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Triangle(25 , 20);
		s[2] = new Rectangle();
		
		Circle c = (Circle)s[0];
		c.setRadius( 10);
		
		Rectangle r = (Rectangle)s[2];
		r.setLength(50);
		r.setWidth(15);
		
		double totalarea = TestByMethodArgument.getArea(s);
		System.out.println("totalarea:   "+totalarea);
		
		
		
	}

	 

}
