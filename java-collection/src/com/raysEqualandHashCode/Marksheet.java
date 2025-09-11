package com.raysEqualandHashCode;

public class Marksheet {

	private int rollno;
	private int marks;
	
	public Marksheet(int rollno , int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Marksheet)) {
			return false;
		}
		
		Marksheet m = (Marksheet)obj;
		return this.rollno == m.rollno && this.marks == m.marks;
	}
}
