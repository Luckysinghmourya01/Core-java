package com.rays.basic;

public class FindAFruit {
	 public static void main(String[] args) {
		 
		 String[] fruits = {"apple" , "mango" , "banana" , "kiwi" , "dragonfruit" , "pinapple" , " orange" };
		 String fruit="orange";
		  int count= -1;
		 
		 for(int i=0; i<fruits.length; i++) { 
			if( fruit == fruits[i]) {
				 
				 count = i;
				 System.out.println(count + "=" + fruits[i] );
			 }
		 }
		 if(count == -1 ) {
			 System.out.println(count);
		 }
	 }

}
