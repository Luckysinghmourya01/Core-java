package com.rays.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class ReadInputFile {

	public static void main(String[] args) throws IOException {
	
		
		InputStreamReader r = new InputStreamReader(System.in);
		
		System.out.println("print a number ");
		
		char i = (char)r.read();
		
		System.out.println("you enter a: " +i);
		
		r.close();
	}
}
