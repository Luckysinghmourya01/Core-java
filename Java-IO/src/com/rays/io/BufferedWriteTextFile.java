package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteTextFile {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter br = new BufferedWriter(new FileWriter("D://IO//StudentData.txt"));
		
		br.write("name= abhimanyu singh");
		br.newLine();
		br.write("enroll= 233caa046");
		br.newLine();
		br.write("course= bca");
		
		System.out.println("file write sucessfully\n");
		
		br.close();
	}
}
