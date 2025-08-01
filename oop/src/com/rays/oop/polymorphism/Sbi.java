package com.rays.oop.polymorphism;

public class Sbi extends Bank {
	
	private String name;
    private String accno;
    
    public void setname(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void setAccno(String accno) {
    	this.accno = accno;
    }
    
    public String getAccno() {
    	return this.accno;
    }
    
    @Override
    public String Name() {
    	
    	return "SBI";
    }
    
    @Override
    public double Interest() {
    	
    	return 9.50;
    }

}
