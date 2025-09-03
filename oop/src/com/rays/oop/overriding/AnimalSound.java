package com.rays.oop.overriding;

public class AnimalSound {

	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String makesound() {
		
		return "make sound";
	}
}
