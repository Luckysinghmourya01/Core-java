package com.rays.collectionmap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one" , 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		m.put("six", 6);
		
		System.out.println(m);
		System.out.println(m.containsKey("six"));
		System.out.println(m.containsValue(7));
		System.out.println(m.containsValue(6));
		System.out.println(m.size());
		System.out.println(m.get("one"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		m.remove("one");
		System.out.println(m);
		
	}
}
