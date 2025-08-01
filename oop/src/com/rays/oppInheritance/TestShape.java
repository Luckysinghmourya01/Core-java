package com.rays.oppInheritance;

public class TestShape {
	
	private static QuatrerCircle Quatrercircle;

	public static void main(String[]args)
	{
		Circle c = new Circle();
			c.setColor("blue");
			c.setBorderwidth(4);
			c.setRadius(4);
			
			System.out.println("color= "+c.getColor());;
			System.out.println("border width= "+c.getBorderwidth());
			System.out.println("radius= "+c.getRadius());
			System.out.println("area of cicle= "+c.area());
			
			System.out.println("----------rectangle----------");
			
			Rectangle r = new Rectangle();
			r.setColor("black");
			r.setBorderwidth(4);
			r.setLength(5);
			r.setWidth(7);
			
			
			System.out.println("rectangle coclor= "+r.getColor());
			System.out.println("border width= "+ r.getBorderwidth());
			System.out.println("length= "+ r.getLength());
			System.out.println("width= "+ r.getwidth());
			System.out.println("Area of rectangle= "+r.area());
			
			System.out.println("--------------Triangle-------------");
			
			
			Triangle t  = new Triangle() ;
			t.setColor("red");
			t.setBorderwidth(3);
			t.setBase(10);
			t.setHeight(5);
			
			System.out.println("Triangle color= "+t.getColor());
			System.out.println("border width= "+t.getBorderwidth());
			System.out.println("base= "+t.getBase());
			System.out.println("height= "+t.getHeight());
			System.out.println("Area of triangle= "+t.area( ));
			
			System.out.println("------------semicircle--------------");
			
			
			SemiCircle s = new SemiCircle();
			
			s.setRadius(4);
			
			System.out.println("radius: "+s.getRadius());
			System.out.println("area of semicircle: "+s.area());
			
			System.out.println("------------quartercircle--------------");
			
			QuatrerCircle q = new QuatrerCircle();
			q.setRadius(7);
			
			System.out.println("radius: "+q.getRadius());
			System.out.println("quatrercircle: "+q.area());
	}

}
