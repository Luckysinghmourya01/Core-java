package com.rays.oop.polymorphism;

public class Circle extends Shape {

	protected int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public double area() {
		double area = PI * radius * radius;
		return area;
	}
}
