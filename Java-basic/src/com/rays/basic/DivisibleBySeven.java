 package com.rays.basic;

public class DivisibleBySeven {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=101; i<200; i++) {
			
			
			
			if(i % 7==0) {
				System.out.println("Divide by 7 = "+i);
				sum = sum+ i;
			}
		}
		System.out.println( "all no of sum=" + sum);
	}
}