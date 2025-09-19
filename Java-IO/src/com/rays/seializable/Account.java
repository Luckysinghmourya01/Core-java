package com.rays.seializable;

import java.io.Serializable;

public class Account implements Serializable {

	public transient String accno;
	public double balance;
	
	public Account( String accno , double balance) {
		this.accno = accno;
		this.balance = balance;
}
	
  public String toString() {
	 
	return   "accno: " + accno + "balance: " + balance;
	
  }
}