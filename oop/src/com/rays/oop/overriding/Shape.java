package com.rays.oop.overriding;

public class Shape {

	protected String color;
	
	public void setColor(String color) {
		this .color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double area() {
		return 0.0;
	}
	
	public double parameter() {
		return 0.0;
	}
}
