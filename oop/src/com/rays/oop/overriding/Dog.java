package com.rays.oop.overriding;

public class Dog extends AnimalSound {

	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String makesound() {
		//System.out.println("bhow----bhow");
		return "bhow---bhow";
				
	} 
}
