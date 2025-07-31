package com.rays.basic;

public class BuyPizza {
	public static void main(String[] args)
	{
		int[] i = {500,600,2000};
		for(int money:i) {
		
		 if(money < 1000) {
			 System.out.println(" You can buy pizza");
		 }
		 else {
			 System.out.println("can not buy pizza");
		 }
	}

}
}
