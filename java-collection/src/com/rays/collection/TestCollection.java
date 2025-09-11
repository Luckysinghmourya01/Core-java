package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(10);
		c.add(9.6);
		c.add("ram");
		c.add('a');
		
		System.out.println(c);
		
		System.out.println("--------------");
		
		for(Object o : c) {
		System.out.println(o);
		}
	}
}
