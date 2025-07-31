 package com.rays.basic;

public class Array {
	public static void main(String[] args)
	{
		int[] a = {5 ,10, 15, 20, 25, 30, 40};
		
		System.out.println( a[0]+ ","+ a[6]);
		
		System.out.println("for each loop");
		for(int b:a) {
			System.out.println(b);
		}
		System.out.println("-------------------- for loop");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
