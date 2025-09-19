package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ValidEmail {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//email.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//validmail.txt"));
		
		String s = br.readLine();
		while( s != null) {
			
			if( s.endsWith("@gmail.com")) {
				System.out.println("email: "+ "" +s);
				bw.write(s);
				bw.newLine();
			}
			
			s = br.readLine();
		}
		System.out.println("sucess");
		br.close();
		bw.close();
	}
}
