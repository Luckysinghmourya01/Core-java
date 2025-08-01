
package com.rays.oop;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	public  final static int AVG_AGE = 18;

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name; 
	} 

	public Date getdob() {
		return this.dob;
	}

	public void setdob(Date  string) {
		this.dob = string;
	}

	public String getaddress() {
		return this.address;

	}

	public void setaddress(String address) {
		this.address = address; 

	}
public int getAge() {
	Date now = new Date();
	Date dob = getdob();
	int Age = now.getYear() - dob.getYear();
	return Age;
}
}
