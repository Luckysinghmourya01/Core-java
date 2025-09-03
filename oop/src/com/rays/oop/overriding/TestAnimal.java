package com.rays.oop.overriding;

public class TestAnimal {

	public static void main(String[] args) {
		
		AnimalSound a = new Dog();
		Dog d = (Dog)a;
		
	d.setName("german sherphed");
		d.setAge(10);
		
		System.out.println("name: "+d.getName());
		System.out.println("age: "+ d.getAge());
		System.out.println("dog sound: "+a.makesound());
		
	System.out.println("------------------------------");
		AnimalSound a1 = new Cat();
		Cat c = (Cat)a1;
		  
		c.setName("cat");
		c.setAge(15);
		System.out.println("name: "+c.getName());
		System.out.println("age: "+c.getAge());
		System.out.println("cat sound: "+ a1.makesound());
	}
}
