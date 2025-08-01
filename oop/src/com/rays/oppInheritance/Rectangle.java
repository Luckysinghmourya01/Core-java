package com.rays.oppInheritance;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return this. length;
	}
	
	public void setWidth(int width) {
		this.width = width;
		
	}
	
	public int getwidth() {
		return this.width;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}
}
