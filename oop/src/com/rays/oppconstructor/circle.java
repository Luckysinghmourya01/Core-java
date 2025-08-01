package com.rays.oppconstructor;

public class circle extends Shape {

	private int radius;
	
	public circle(int radius) {
	this.radius = radius;	
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}
}
