package com.rays.basic;

import java.time.LocalDate;

public class TestLocalDate {
public static void main(String[] args)
{
	LocalDate now = LocalDate.now();
	System.out.println(now);
	
	System.out.println(now.getDayOfMonth());
	System.out.println(now.getDayOfYear());
	System.out.println(now.getDayOfWeek() );
}
}
