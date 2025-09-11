package com.rays.listcollection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List l  = new ArrayList();
		
		l.add(10);
		l.add("shyam");
		l.add(true);
		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.set(0, 9);
		System.out.println(l);
		System.out.println(l.size());
		l.add("aman");
		System.out.println(l.size());
		l.remove(0);
		System.out.println(l);
		System.out.println(l.get(1));
		
}
}