package com.rays.basic;

public class TestString {
	public static void main(String[]args) {
		String name = "Lucky singh mourya";
		System.out.println("name= " +name);
		System.out.println("name length="+name.length());
		System.out.println("charatet no= "+name.charAt(17));
		System.out.println("find index position=   "+name.indexOf("L"));
		System.out.println("LAST index value=  "+name.lastIndexOf("r"));
		System.out.println("replace name value= "+name.replace("u","a"));
		System.out.println("lower case = "+name.toLowerCase());
		System.out.println("name start with= "+name.startsWith("Lucky"));
		System.out.println("name end with= "+name.endsWith("a"));
		System.out.println("substring= "+name.substring(5));
	}

}
