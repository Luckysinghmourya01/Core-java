package com.rays.oppconstructor;

public class Triangle extends Shape {
	
	private int base;
	private int height; 
	
	
	public Triangle(int base , int height) {
		this.base = base;
		this.height = height;
	}
	
	  public int getBase() {
		  return this.base;
	  }
	  
	  public int getHeight() {
		  return this.height;
	  }
	  
	  public double area() {
		  double area = 0.5 * base * height;
		  return area;
	  }

}
