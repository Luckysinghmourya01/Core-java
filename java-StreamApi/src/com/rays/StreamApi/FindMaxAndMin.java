package com.rays.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMin {

	public static void main(String [] args) {
		
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(4000);
		
		l.add(4000);
		l.add(2000);
		l.add(5000);
		l.add(1000);
		l.add(3000);
		
		System.out.println(l);
		System.out.println("--------- largest number -------");
		l.stream().distinct().max(Comparator.naturalOrder()).ifPresent( e -> System.out.println(e));
		
		System.out.println("----------- lowest largest ----------");
		l.stream().distinct().min(Comparator.naturalOrder()).ifPresent(e -> System.out.println(e));
		
		System.out.println("---------- reverse no ---------");
		l.stream().distinct().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
		
		System.out.println("------------ second lagest ----------");
		
		l.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(e -> System.out.println(e));
		
		System.out.println("----------- dec to asec");
		l.stream().distinct().sorted(Comparator.reverseOrder()).forEach( e -> System.out.println(e));
		
		System.out.println("---------  asec to dec ---------");
		l.stream().distinct().sorted(Comparator.naturalOrder()).forEach(e -> System.out.println(e));
		
	}
}
