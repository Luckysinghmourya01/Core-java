package com.rays.oppInheritance;

public class Student extends Person {
	
	private String branch;
	private double rollno;
	private double marks;
	
	 public void setBranch(String branch) {
		 this.branch = branch;
	 }
	 public String getBranch() {
		 return this.branch;
	 }
	 
	  public void setRollno(double rollno) {
		  this.rollno = rollno;
	  }
	  
	  public double getRollno() {
		  return this.rollno;
	  }
	  
	  public void setMarks(double marks) {
		  this.marks = marks;
	  }
	  
	  public double getMarks() {
		  return this.marks;
	  }

}
