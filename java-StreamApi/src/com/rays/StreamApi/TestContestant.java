package com.rays.StreamApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {
		
		List<Contestant> l = new ArrayList<Contestant>();
		
		l.add(new Contestant("9996965796", "pradeep"));
		l.add(new Contestant("9636360410", "ballu"));
		l.add(new Contestant("7804931017", "ravi"));
		l.add(new Contestant("7247084759", "piyush"));
		l.add(new Contestant("9179564112", "rakesh"));
		l.add(new Contestant("7804931017", "shubham"));
		l.add(new Contestant("11 " , "invalid"));
		
		System.out.println("---------- get phone no ----------");
	l.stream().map(e -> e.phone).forEach(e -> System.out.println(e));
		
		System.out.println("--------- remove duplicate no ---------");
		l.stream().map(e ->  e.phone).distinct().forEach( e ->System.out.println(e));
				
		System.out.println("--------- remove invalid no --------");
		
		l.stream().map(e -> e.phone).distinct().filter(e -> e.length() == 10).forEach( e -> System.out.println(e));
		
		System.out.println("----------- suffel phone no -----------");
		
		l.stream().map(e -> e.phone).filter(e -> e.length()== 10).collect(Collectors.collectingAndThen(Collectors.toList(), e->{
        Collections.shuffle(e);

		return e.stream();
		})).forEach( e -> System.out.println(e));
			
		System.out.println("----------- get 3 winner");
		
		l.stream().map(e -> e.phone).distinct().filter(e -> e.length() == 10).collect(Collectors.collectingAndThen(Collectors.toList(), e ->{
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach( e -> System.out.println(e));
	}
}
