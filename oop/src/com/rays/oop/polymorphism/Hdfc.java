package com.rays.oop.polymorphism;

public class Hdfc extends Bank {
	
	@Override
	public String Name() {
		
		return "HDFC";
	}
	
	@Override
	public double Interest() {
		
		return 9.00;
	}

}
