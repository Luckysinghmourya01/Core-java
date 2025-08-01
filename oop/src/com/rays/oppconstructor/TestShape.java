package com.rays.oppconstructor;

public class TestShape {
	
	public static void main(String[]args) {
		
		System.out.println("-------------circle----------");
		
		circle c = new circle(2);
		c.setColor("red");
		c.setBorderwidth( "4");
		
		System.out.println("color:"+c.getColor());
		System.out.println("border:"+c.getBorderwidth());
		System.out.println("radius:"+c.getRadius());
		System.out.println("area of circle:"+c.area());
		
		System.out.println("--------------rectangle-----------");
		
		Rectangle r = new Rectangle(10,5);
		r.setColor("blue");
		
		System.out.println("color: "+r.getColor());
		System.out.println("length: "+r.getLength());
		System.out.println("width: "+r.getWidth());
		System.out.println("area of rectangle: "+r.area());
		
		System.out.println("----------------triangle--------------"); 
		
		Triangle t = new Triangle(15,20);
	
		
		System.out.println("base: "+t.getBase());
		System.out.println("height: "+t.getHeight() );
		System.out.println("area of triangle: "+t.area());
	}
}
