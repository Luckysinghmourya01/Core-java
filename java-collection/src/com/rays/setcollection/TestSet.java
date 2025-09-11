package com.rays.setcollection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add('c');
		s.add('b');
		s.add('a');
		s.add('d');
		s.add('f');
		s.add('e');
		s.add('e');
		s.add(null);
		s.add(null);
		
		
		System.out.println(s);
		System.out.println(s.contains('e'));
		
		
	}
}
