package com.raysEqualandHashCode;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(2, "aman");
		Student s2 = new Student(2 , "suraj");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
