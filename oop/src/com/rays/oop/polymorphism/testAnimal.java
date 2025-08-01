 package com.rays.oop.polymorphism;

public class testAnimal {
	public static void main(String[] args) {
		
		Animal[] a = new Animal[2];
		a[0] = new Cat();
		a[1] = new Dog();
	
		
		
		for(int i=0; i<a.length; i++ ) {
			
			System.out.println( a[i].AnimalSound());
		}
		
		
	}

}
