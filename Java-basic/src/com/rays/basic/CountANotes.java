package com.rays.basic;

public class CountANotes { 
	public static void main(String[] args)
	{
		int money = 1590;
		int count = 0;
		
		int[] notes = { 500 , 10};
 		for(int note : notes ) {
			count = money/note;
			System.out.println(note+ "=" +count);
			
			money = money%note;
		}
		
		
	}

}

