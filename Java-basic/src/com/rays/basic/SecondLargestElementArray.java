package com.rays.basic;

public class SecondLargestElementArray {
	
	public static void main(String[] args) {
		
		int[] array = { 20 , 30 , 40 , 60 , 70};
		
		int n = array[0];
		for( int a : array) {
			if(a > n) {
				a = n;
			}
		}
		
		
		System.out.println(n);
	}

}
