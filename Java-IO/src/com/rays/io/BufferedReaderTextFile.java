package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class  BufferedReaderTextFile  {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//Lucky.txt"));
			
		 String s = br.readLine();	
		
		while( s != null) {
			System.out.println(s);
			s = br.readLine();
		}
			
		br.close();
		
	}
	
}
