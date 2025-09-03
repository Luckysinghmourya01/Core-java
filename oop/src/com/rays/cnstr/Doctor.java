package com.rays.cnstr;

public class Doctor extends Person
{
	private String surgery;
	
	public Doctor(String name , String age , String surgery) {
		super(name, age);
		this.surgery = surgery;
	}
	
	public String getSurgery() {
		return this.surgery;
	}

}
