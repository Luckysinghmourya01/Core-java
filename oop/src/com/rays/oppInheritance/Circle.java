package com.rays.oppInheritance;

public class Circle extends Shape {
	

protected int radius;

public void setRadius(int radius) {
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
