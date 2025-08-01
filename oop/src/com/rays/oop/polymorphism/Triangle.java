package com.rays.oop.polymorphism;

public class Triangle extends Shape{

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
		double area = (height * base)/2;
		return area;
	}
	
}
