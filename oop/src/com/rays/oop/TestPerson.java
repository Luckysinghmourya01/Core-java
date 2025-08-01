    
package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Person p = new Person();

		
		p.setname("piyush");
		p.setdob(sdf.parse("27-5-2007"));
		p.setaddress("indore");

		System.out.println("Name= " +p.getname());
		System.out.println("Dob: "+sdf.format(p.getdob()));
		System.out.println("Address= " +p.getaddress());
		System.out.println("current age= " + p.getAge());

	}

}
