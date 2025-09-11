package com.rays.setcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class TestItterator {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(10);
		c.add(9.9);
		c.add("ram");
		c.add('d');
		c.add(true);
		
		System.out.println(c);
		
		Iterator it =c.iterator();
		while(it.hasNext()) {
		//	Object o = it.next();
			System.out.println(it.next());
		}
	

	
	}
}
