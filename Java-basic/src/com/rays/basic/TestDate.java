package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException
	{
		Date d = new Date();
		
		System.out.println( " Before formating = " +d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("  dd/MM/yyyy  h :mm:ss a z ");
		String formatdate =  sdf.format(d);
		System.out.println( "After formating = " +formatdate);
		
		System.out.println("------------------");
		
		String dob ="27/5/2006";
		System.out.println(dob);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf1.parse(dob);
		System.out.println("" + d1  );
		
	}

} 
