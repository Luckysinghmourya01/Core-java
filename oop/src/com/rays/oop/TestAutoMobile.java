package com.rays.oop;

public class TestAutoMobile {

	public static void main(String[]args)
	{
		
		AutoMobile A = new AutoMobile();
				
				A.setcolor("blue");
		A.setspeed(120);
		A.setmake("G vagn");
		
		System.out.println("Car color = "+A.getcolor());
		System.out.println("Max speed = "+A.getspeed());
		System.out.println("model name = "+A.getmake());

	A.accelerater();
	A.breeak(); 
		System.out.println("------------");
		
		
		
	}
	
}
