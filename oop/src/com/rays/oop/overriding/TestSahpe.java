package com.rays.oop.overriding;

public class TestSahpe {
	
	public static void main(String[] args) {
		
		
		Shape s1 = new Circle();
		// type casting
		Circle c = (Circle)s1;
		
		s1.setColor("brown");
		c.setRadius(9);
		
		System.out.println("radius:"+c.getRadius());
		System.out.println("area of circle: "+s1.area());
		System.out.println("area of parameter:"+s1.parameter ()); 
		
		System.out.println("----------rectangle--------------");
		
		Shape s2 = new Rectangle();
		Rectangle r = (Rectangle)s2;
		
		r.setColor("black");
		r.setLength(6);   
		r.setWidth(6);
		
		System.out.println("color: "+r.getColor());
		System.out.println("length:"+r.getLength());
		System.out.println("width:"+r.getWidth());
		System.out.println("area of rectangle: "+s2.area());
		System.out.println("area of parameter:"+s2.parameter());
		
		System.out.println("----------triangle---------");
		
		Shape s3 = new Triangle(5,7);
		Triangle t = (Triangle)s3; 
		t.setColor("red");
		System.out.println("height: "+t.getHeight());
		System.out.println("base: "+t.getBase());
		System.out.println("triangle: "+s3.area());
		
		System.out.println("---------semicircle-----------");
		
		SemiCircle c1 = new SemiCircle();
		
		c1.setRadius(9);
	 	
		System.out.println(c1  .getRadius());
		System.out.println("area of semicircle: "+c1.area());
	}

}
 