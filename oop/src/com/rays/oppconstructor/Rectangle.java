package com.rays.oppconstructor;

public class Rectangle extends Shape{

	private int length;
	private int width;
	
	public Rectangle(int length , int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}
}
