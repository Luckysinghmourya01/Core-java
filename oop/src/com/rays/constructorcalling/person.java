
package com.rays.constructorcalling;

public class person {

	private String name;
	private String age;
	
	
	public person() {
	}
	
	public person(String name , String age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAge() {
		return this.age;
	}
}
