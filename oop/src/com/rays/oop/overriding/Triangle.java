 package com.rays.oop.overriding;

public class Triangle extends Shape {

	private int height;
	private int base;
	
	public Triangle(int height , int base) {
		this.height = height;
		this.base = base;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getBase() {
		return this.base;
	}
	
	@Override
	public double area() {
		double area = 0.5 * height * base;
		return area;
	}
	
}
