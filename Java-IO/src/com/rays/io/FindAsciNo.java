package com.rays.io;

public class FindAsciNo {

	public static void main(String[] args) {
		
		for(char i='a'; i<= 'z'; i++) {
			
			System.out.println(i+ "=" +(int)i);
		}
		
		System.out.println("----- capital A to Z --------");
		
		char a = 'A';
		char a1 = 'B';
		char a2 = 'C';
		
		System.out.println("A = " + (int)a);
		System.out.println("B = " + (int)a1); 
		System.out.println("c = " + (int)a2);
	}
}
