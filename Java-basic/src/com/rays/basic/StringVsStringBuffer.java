package com.rays.basic;

public class StringVsStringBuffer {
public static void main(String[] args)
{
	// string is immutable //
	String str= " sunrays";
	
String str1 = "lowercase";
	System.out.println(str );
	System.out.println(str1);
	
	System.out.println("---------------");
	
	// string buffer is mutable //
	
	StringBuffer sb= new StringBuffer("jay shree");
	System.out.println(sb);
	
	sb.append("ram");
	System.out.println(sb);
}

}
