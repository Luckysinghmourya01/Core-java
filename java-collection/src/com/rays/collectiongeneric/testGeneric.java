package com.rays.collectiongeneric;

import java.util.ArrayList;
import java.util.List;

public class testGeneric {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
	
		
   System.out.println(l);

System.out.println(l.get(2));
  
  System.out.println("----------- String ---------");
  
  List<String> l1 = new ArrayList<String>();
  
  l1.add("aman");
  l1.add("naman");
  l1.add( "kamal");
  l1.add("chaman");
  l1.add("ayush");
  
  
  System.out.println(l1);
  
  
	}
}
