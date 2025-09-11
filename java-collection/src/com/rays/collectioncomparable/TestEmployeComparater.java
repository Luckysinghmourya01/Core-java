package com.rays.collectioncomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployeComparater {

	public static void main(String[] args) {
		
		List<Employe> l = new ArrayList<Employe>();
		
		l.add(new Employe(5, "kamal", 15000));
		l.add(new Employe(1, "raman", 30000));
		l.add(new Employe(4, "aman", 45000));
		l.add(new Employe(2, "punam", 50000));
		l.add(new Employe(3, "abhishek", 35000));
		
		l.forEach(System.out :: println);
		
		System.out.println("--------- sorting by name--------------");
		OrderByName N = new OrderByName();
		Collections.sort(l, N);
		       
		    l.forEach(System.out :: println);
		
		System.out.println("--------------- sorting by id---------------");
		
		OrderById i = new OrderById();
		Collections.sort(l, i);
		
	         Iterator<Employe> e  = l.iterator();
	         while(e.hasNext()) {
	        	 Employe e1 = e.next();
	        	 System.out.println(e1);
	         }
	         
		
		System.out.println("----------------- sorting by salary --------");
		
		OrderBySalary s = new OrderBySalary();
		Collections.sort(l, s);
		
		l.forEach(System.out :: println);
	}
}
