 package com.rays.oop.polymorphism;

public class Animal {
	
	
	public String AnimalSound() {
		//System.out.println("Animal sound");
		return "AnimalSound" ;
	}
	
	public static Animal getAnimal(int i) {
		if( i == 1) {
			return new Dog();
		}
		
		if( i == 2) {
			return new Cat();
		}
		
		return new Animal();
	}

}
