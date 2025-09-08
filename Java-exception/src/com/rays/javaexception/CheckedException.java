package com.rays.javaexception;

public class CheckedException {

	public static void main(String[] args){
		
			son();
	}
	
	public static void son()   {
		
			
				try {
					throw new Exception("make a mistake");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			
		
	}
}
