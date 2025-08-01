package com.rays.oop.overriding;

public class SemiCircle extends Circle{

	
	@Override
	public double area() {
		double area = 0.5* Math.PI * radius * radius;
		return area;
	}
}
