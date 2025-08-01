package com.rays.oop;

public class TestAccount {

	public static void main(String[] args)
	{
		Account a = new Account();
		
		a.setnumber("1552471917");
		a.settype("private");
		a.setbalance(5000.0);
		
		System.out.println("account no = " +a.getnumber());
		System.out.println("this account= " +a.gettype());
		System.out.println( "account balance= " +a.getbalance());
		
		a.Deposit(600);		
		a.Witdrawl(600);
		a.Witdrawl(200);
		
	}
}
