package com.rays.oop.practice;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[2];
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		
		Circle c = (Circle)s[0];
		c.setRadius(8);
		
		Rectangle r = (Rectangle)s[1];
		r.setLength(39);
		r.setWidth(5);
		
		double totalarea = TestShapeByMethodArrgument.getArea(s);
		System.out.println("Totalarea= "+totalarea);
	}

} 
