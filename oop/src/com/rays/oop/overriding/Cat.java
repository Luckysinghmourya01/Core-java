package com.rays.oop.overriding;

public class Cat extends AnimalSound {

	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String makesound() {
		
		return "meow------meow";
	}
}
