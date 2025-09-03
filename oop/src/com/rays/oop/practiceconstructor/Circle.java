package com.rays.oop.practiceconstructor;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle (int radius) {
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
