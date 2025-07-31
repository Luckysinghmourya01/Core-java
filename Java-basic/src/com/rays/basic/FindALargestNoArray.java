package com.rays.basic;

public class FindALargestNoArray {
	public static void main(String[] args)
	{
	 int[] array = {50 , 26 , 78 , 88  , 20};
	 
	 int n = array[0];
	 for(int a:array ) {
		 if(a > n ) {
			 
			 n = a;
		 }
		 
	 }
	 System.out.println("largest no= "+n);
	 
	}
	}  