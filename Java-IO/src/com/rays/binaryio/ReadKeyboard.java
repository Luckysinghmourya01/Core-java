package com.rays.binaryio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadKeyboard {

	public static void main(String[] args) throws Exception {
		
		PrintWriter out = new PrintWriter(new FileWriter("D://IO//keyboard.txt", true));
		
		InputStreamReader  kb = new InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(kb);
		
		 String s = in.readLine();
		 while(!s.equals("quit")) {
			 out.write(s);
			 s = in.readLine();
		 }
		in.close();
		out.close();
		kb.close();
	}
}
