package com.rays.collectioncomparable;

import java.util.Comparator;

public class OrderById implements Comparator<Employe> {


	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o1.id - o2.id;
	}

}
