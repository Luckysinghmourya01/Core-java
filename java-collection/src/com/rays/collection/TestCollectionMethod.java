package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(10);
		c1.add(9.9);
		c1.add("ram");
		c1.add(true);
		c1.add('w');
		
		System.out.println(c1);
		c1.remove(9.9);
		System.out.println(c1);
		System.out.println(c1.contains(10));
		System.out.println(c1.contains("aman"));
		System.out.println(c1.size());
		System.out.println(!c1.isEmpty());
		System.out.println(c1);
	}
}
