package com.rays.oop.practiceconstructor;

public class TestShape {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		c.setcolor("black");
		System.out.println("color: " +c.getColor());
		System.out.println("radius: "+ c.getRadius());
		System.out.println("area of circle: "+ c.area());
		
		System.out.println("------------ rectangle----------");
		
		Rectangle r = new Rectangle(25 , 25);
		
		System.out.println("length: "+ r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("area of rectangle: " + r.area());
}
} 