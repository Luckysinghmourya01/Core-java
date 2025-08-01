package com.rays.oppInheritance;

public class TestAnimal {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.setName("german shephed");
		d.setSound("bhow......bhow");
		d.setAge(15);
		d.setEat("non-vegiterian");
		
		
		System.out.println("name= "+d.getName());
		System.out.println("sound= "+d.getSound());
		System.out.println("age limit= "+d.getAge());
		System.out.println(d.getEat());
		
		System.out.println("----------------lion-----------");
		
		Lion l = new Lion();
		l.setName("lion");
		l.setSound("how........how....");
		l.setSkill("hunting");
		l.setEat("non-vegiterian");
		
		System.out.println("name= "+l.getName());
		System.out.println("sound= "+l.getSound());
		System.out.println("skill= "+l.getSkill());
		System.out.println("eating= "+l.getEat());
	}

}
