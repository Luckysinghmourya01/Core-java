

package com.rays.collectioncomparable;

import java.util.Collection;

public class MarksheetComparable implements Comparable<MarksheetComparable> {

	private String name;
	private String rollno;
	private int marks;
	
	public MarksheetComparable(String name , String rollno , int marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		
	}
	
	public String toString() {
		
		return "name: " +name + ", rollno: " + rollno  + ", marks: " + marks;
	}

	@Override
	public int compareTo(MarksheetComparable o) {
		
	//	return this.rollno.compareTo(o.rollno); // asscending to decending ka liya;
	return o.rollno.compareTo(this.rollno); // decending to ascending ka liya;
	
		
	}
	
	
}
