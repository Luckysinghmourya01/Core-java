package com.rays.practicePolymorphism;

public class Sbi extends Bank {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public String name() {
		
		return "SBI";
	}
	
	@Override
	public double interest() {
		
		return 10.75;
	}
}
