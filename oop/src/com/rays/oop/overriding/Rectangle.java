package com.rays.oop.overriding;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	@Override
	public double area() {
		double area = length * width;
		return area;
	}
	
	@Override
	public double parameter() {
		double parameter = (length + width) *2;
		return parameter;
	}
}
