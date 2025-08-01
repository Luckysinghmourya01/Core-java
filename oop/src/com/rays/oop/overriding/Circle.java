package com.rays.oop.overriding;

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
		double area = Math.PI * radius * radius;
		return area;
	}
	@Override
	public double parameter() {
		double parameter = 2 * Math.PI * radius;
		return parameter;
	}
		
	}

