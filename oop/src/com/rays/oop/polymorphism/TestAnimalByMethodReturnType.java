package com.rays.oop.polymorphism;

public class TestAnimalByMethodReturnType {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[2];
		Animal a1 = new Animal();
		
		a[0] = Animal.getAnimal(1);
		a[1] = Animal.getAnimal(2);
		
		System.out.println(a1.AnimalSound());
		
		for(int i = 0; i<a.length; i++) {
			
			System.out.println(a[i].AnimalSound());
		}
	}
	
}
