package com.rays.basic;

public class ReverseNo {
	public static void main(String[] args)
	{
		int i=435;
		int temp = i;
		int r = 0;
		int rv = 0;
		while(temp>0) {
			r = temp%10;
  			rv = (rv*10)+r;
			temp = temp/10;
		}
		System.out.println(rv);
		if(i==rv) {
			System.out.println("is palindrome no");
		}
		else {
			System.out.println("is not palindrome no");
		}
	}

}
