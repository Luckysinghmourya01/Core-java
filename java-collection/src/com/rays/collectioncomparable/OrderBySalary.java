package com.rays.collectioncomparable;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o1.salary - o2.salary;
	}

}
