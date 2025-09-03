package com.rays.cnstr;

public class B extends A {

	// child class parent ke default constructor ko call krti hai;

	public B() {
		super(10, 20);
		System.out.println("b is constructor" );
	}

}
