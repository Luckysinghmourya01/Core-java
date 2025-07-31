package com.rays.basic;

import java.util.Scanner;

public class InputValur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value :");
		int x = sc.nextInt();
		
		if(x%2 == 0) {
			System.out.println("even number");
			
		}
		System.out.println("odd number");
		
		
	}

}
