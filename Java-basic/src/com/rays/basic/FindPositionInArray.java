package com.rays.basic;

public class FindPositionInArray {
	public static void main(String[] args)
	{
	int[] array = {1 , 2, 3, 3, 4, 9 ,9,8,2, 5, 7};
	int n=9;
	int count = -1;
	
	for(int i = 0; i<array.length; i++) {
		if(n==array[i]) {
			count=i;
			System.out.println(count+"="+array[i]);
		}
	}
	if(count == -1 ) {
		System.out.println(count);
	}
	}
}