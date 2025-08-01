package com.rays.oop.polymorphism;

public class SemiCircle extends Circle{
	
	@Override
	public double area() {
		double area = 0.5 * PI * radius * radius;
		return area;
	}

}
