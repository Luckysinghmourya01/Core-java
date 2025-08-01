package com.rays.oop.polymorphism;

public class TestmethodReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);

		Circle c = (Circle) s[0]; 
		c.setRadius(9);

		Triangle t = (Triangle) s[1];

		Rectangle r = (Rectangle) s[2];
		r.setLength(7);
		r.setWidth(8);

		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].area());
		}
	}

}
