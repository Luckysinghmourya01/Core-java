package com.rays.listcollection;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {

public static void main(String[] args) {
	
	
	List l  = new ArrayList();
	
	l.add(10);
	l.add("shyam");
	l.add(true);
	l.add(15);
	l.add('p');
	
	System.out.println(l);
	System.out.println(l.indexOf(10));
	System.out.println(l.indexOf(true));
	System.out.println(l.lastIndexOf('p'));
	System.out.println(l.subList(1, 4));
	l.remove(3);
	System.out.println(l);
	System.out.println(l.get(3));
}
}
