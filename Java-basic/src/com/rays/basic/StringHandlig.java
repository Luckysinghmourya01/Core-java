package com.rays.basic;

public class StringHandlig {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("welcome");
		String s4 = new String("welcome");

		System.out.println(s1 == s2);
		System.out.println(s3.equals(s4));
	}
}