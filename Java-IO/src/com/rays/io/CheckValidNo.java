package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CheckValidNo {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//number.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//validnumber.txt"));
		
		 String s = br.readLine();
		 while( s != null) {
			 if( s.length() == 10) {
				System.out.println("valid no: " +s); 
				bw.write(s);
				bw.newLine();
			 }
			
			 s = br.readLine();
		 }
		 
		 br.close();
		 bw.close();
	}
}
