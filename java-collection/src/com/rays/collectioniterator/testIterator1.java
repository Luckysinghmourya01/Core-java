package com.rays.collectioniterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testIterator1 {
// iterator  modern class ka sat use hota h
	// iterator fali fast hota h
	// collection se data nikal ka iterator me store krne ka bad new data add nhi hota h
	// exception aati h 
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(5);
		l.add(5.5);
		l.add('w');
		l.add("laxman");
		l.add(true);
		
	//	System.out.println(l);
		
		
		Iterator It = l.iterator();
		// l.add(false);  
		
		while(It.hasNext()) {
			Object o = It.next();
			It.remove();
			System.out.println("o: " + o);
			System.out.println("list: " +l);
			 
		}
		
	}
}
