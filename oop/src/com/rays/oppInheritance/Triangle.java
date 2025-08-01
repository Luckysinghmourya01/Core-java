package com.rays.oppInheritance;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	
	public void setBase(int base) {
		this.base = base;
		
	}
	public int getBase() {
		return this.base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public double area() {
		double area = 0.5 * base * height;
		return area;
	}
	

}
