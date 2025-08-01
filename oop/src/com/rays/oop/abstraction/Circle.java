   package com.rays.oop.abstraction;

public class Circle extends Shape {
	
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public double area() {
		  double area = Math.PI  * radius * radius;
		return area;
	}

}
