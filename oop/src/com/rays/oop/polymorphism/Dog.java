  package com.rays.oop.polymorphism;

public class Dog  extends Animal{
	int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	@Override
	public String AnimalSound() {
		// TODO Auto-generated method stub
		return "bhow.....bhow";
	}

}
