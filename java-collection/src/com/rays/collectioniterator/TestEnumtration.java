package com.rays.collectioniterator;

import java.util.Enumeration;
import java.util.Vector;
// enumeration me all class historical hoti h
// ya not fail pass hoti h

public class TestEnumtration {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(9);
		v.add(5);
		v.add(5.5);
		v.add('w');
		v.add("laxman");
		v.add(true);
		
		System.out.println(v);
		
		Enumeration E = v.elements();
		v.add(false);
		while(E.hasMoreElements()) {
			
			Object o = E.nextElement();
			System.out.println(o);
		}
	}
}
