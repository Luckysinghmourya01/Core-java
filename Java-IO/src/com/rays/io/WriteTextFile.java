package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {
		
		FileWriter w = new FileWriter("D://IO//Lucky.txt"  );
		
		 w.write("hello lucky\n how are you\n what are you doing\n");
		 w.write("focus on your work");
		
		 
		 System.out.println("file are sucessfully write");
		
		 w.close();
	}
}

