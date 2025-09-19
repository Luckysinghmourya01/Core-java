package com.rays.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) {
		
		
		
		try {
			FileReader f = new FileReader("D://IO//Hello.txt");
			 int i = f.read();
			 while(i != -1) {
				 System.out.println((char)i + "=" + i);
				 i=f.read();
			 }
			 f.close();
		}
		catch(Exception e) {
		
			System.out.println(e.getMessage());
		}
		
	}
}
