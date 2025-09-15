package com.rays.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class TestStreamMethod {

	public static void main(String [] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("kamal");
		l.add("kamal");
		l.add("chaman");
		l.add("mohan");
		l.add("mohit");
		l.add("tohit");
		l.add("tokit");
		l.add("toshib");
		l.add("akash");


   
		l.forEach(e -> System.out.print(e+","));
		System.out.println();
		l.stream().distinct().forEach(e -> System.out.print(e+ ","));
		System.out.println();
		System.out.println("----------- after sorting by name ----------");
		l.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println();
		l.stream().distinct().map(e -> e.toUpperCase()).forEach(e -> System.out.print(e+ ","));
		System.out.println();
		l.stream().distinct().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e+ ","));
		System.out.println();
		l.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("t")).forEach(e -> System.out.print(e+ ","));
		
		
		
		
	}
}
