package com.raysEqualandHashCode;

public class Student {

	private int id;
	private String name;
	
	public Student(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		
		
		Student s = (Student)obj;
		return this.id == s.id && this.name == s.name;
	}
	
	@Override
	public int hashCode() {
		String value = name + id;
		return value.hashCode();
	}
}
