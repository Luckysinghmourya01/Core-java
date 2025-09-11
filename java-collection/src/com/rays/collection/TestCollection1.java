package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(5);
		c1.add(5.7);
		c1.add('a');
		c1.add(true);
		c1.add("piyush");
		
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		
		c2.add(7);
		c2.add(8.7);
		c2.add('b');
		c2.add(false);
		c2.add("aman");
		
		System.out.println(c2);
		
		c1.addAll(c2);
		
		System.out.println(c1);
		System.out.println(c1.size());
		c1.removeAll(c2);
		System.out.println(c1);
		System.out.println(c1.containsAll(c1));
	}
}
