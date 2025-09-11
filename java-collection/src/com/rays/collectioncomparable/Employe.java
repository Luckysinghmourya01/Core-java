package com.rays.collectioncomparable;

import java.util.Comparator;

public class Employe  {

	public int id;
	public String name;
	public int salary;
	
	public Employe(int id , String name , int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id: " + id + "  name: " + name + "  salary: "+ "" + salary;
	}

}
