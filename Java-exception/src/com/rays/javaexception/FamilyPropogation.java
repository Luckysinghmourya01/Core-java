package com.rays.javaexception;

public class FamilyPropogation {

	public static void main(String[] args)   {
		try {
			dad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dad() throws Exception {
		mom();
	}

	public static void mom() throws Exception  {
		son();
	}

	public static void son() throws Exception {
		throw new Exception("son of aman");
	}
}
