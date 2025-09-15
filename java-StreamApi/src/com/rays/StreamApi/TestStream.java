package com.rays.StreamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(2);
		l.add(8);
		l.add(3);
		l.add(5);
		l.add(8);
		l.add(10);
		l.add(9);
		
		l.stream().distinct().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e+ " :even"));
		l.stream().distinct().filter(e -> e % 2 != 0).forEach(e -> System.out.println(e+ " :odd"));
		
		
		
	}
}
