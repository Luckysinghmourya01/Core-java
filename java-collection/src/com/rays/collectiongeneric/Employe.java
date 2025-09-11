package com.rays.collectiongeneric;

import java.util.Iterator;

public class Employe {

	private int id;
	private String name;
	private String salary;
	
	public Employe(int id , String name , String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id:" + id + ", name: " + name + "  salary: " + salary;
	}

	
	}

