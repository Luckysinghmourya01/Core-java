package com.rays.practicePolymorphism;

public class Hdfc extends Bank {

	private String accno;
	
	public void setAccno(String accno) {
		this.accno = accno;
	}
	
	public String getAccno() {
		return this.accno;
	}
	
	@Override
	public String name() {
		
		return "Hdfc";
	}
	
	@Override
	public double interest() {
		
		return 9.9;
	}
}
