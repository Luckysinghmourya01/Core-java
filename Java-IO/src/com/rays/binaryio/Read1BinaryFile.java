package com.rays.binaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read1BinaryFile {

	public static void main(String[] args) throws IOException  {
		
		
		FileInputStream fn = new FileInputStream("C:\\Users\\lucky singh mourya\\Downloads\\1234.webp");
	FileOutputStream fo = new FileOutputStream("C:\\IO1\\lucky.webp");
		
		 int i = fn.read();
		   while( i != -1) {
			   System.out.println(i);
			   fo.write(i);
			   i=fn.read();
		   }
		   fn.close();
		   fo.close();
	}
	
	
}
