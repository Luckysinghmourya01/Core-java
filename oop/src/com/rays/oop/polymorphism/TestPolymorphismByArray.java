package com.rays.oop.polymorphism;

public class TestPolymorphismByArray {
	
	public static void main(String[] args) {

		
		Shape[] s = new Shape[4];
		
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle(10,15);
		s[3]= new SemiCircle();
		
	Rectangle r = (Rectangle)s[0];
	r.setLength(10);
	r.setWidth(20);
	  
	Circle c = (Circle)s[1];
	c.setRadius(5);
	
	//Triangle t = (Triangle)s[2];
	//t.setHeight(5);
	//t.setBase(8);
	
	SemiCircle s1 = (SemiCircle)s[3];
	s1.setRadius(9);
	
	
	for(int i=0; i<s.length; i++) { 
	 
		
		System.out.println(s[i].area());
		//System.out.println(s[1].area());
	//	System.out.println(s[2].area());
	}
	}
}
