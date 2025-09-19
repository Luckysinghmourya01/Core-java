package com.rays.binaryio;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ReadBinaryFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fn = new FileInputStream("D://IO//Doremon.webp");
		FileOutputStream fo = new FileOutputStream("D://IO//newdoremon.webp");
		
		  int i = fn.read();
		  while(i != -1) {
			  System.out.println(i);
			  fo.write(i);
			  i = fn.read();
		  }
		  
		  fn.close();
		  fo.close();
	}
}
