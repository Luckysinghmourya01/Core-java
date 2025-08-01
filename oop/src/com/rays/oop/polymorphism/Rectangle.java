package com.rays.oop.polymorphism;

public class Rectangle extends Shape {
	
	private int lenght;
	private int width;

	public int getLegth() {
		return this.lenght;
	}
	
	public void setLength(int length) {
		this.lenght = length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public double area() {
	double area = lenght * width;
		return area;
	}
}
