package com.rays.collectiongeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmpolye {

	public static void main(String[] args) {
		
		List<Employe> l = new ArrayList<Employe>();
		
		l.add(new Employe(1, "raj", "25000"));
		l.add(new Employe(2, "mohan", "30000"));
		l.add(new Employe(3, "vijay", "40000"));
		l.add(new Employe(4, "praful", "35000"));
		
	//Iterator<Employe> It = l.iterator();
		//while(It.hasNext()) {
	//	Employe e =It.next();
	//	System.out.println(e);
		
//	}
		
		l.forEach(System.out :: println);
}
}