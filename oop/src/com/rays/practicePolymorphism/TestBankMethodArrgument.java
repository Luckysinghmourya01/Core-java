
package com.rays.practicePolymorphism;

public class TestBankMethodArrgument {
	
	public static String calbank(Bank[] b2) {
		
		for(int i = 0; i<b2.length; i++) {
			
			System.out.println(b2[i].name()+ "=" + b2[i].interest());
		}
		return "Bank";
	}

}
