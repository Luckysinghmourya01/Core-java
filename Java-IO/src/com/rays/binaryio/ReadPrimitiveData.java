package com.rays.binaryio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadPrimitiveData {

	public static void main(String[] args) throws Exception {
		
		DataOutputStream in = new DataOutputStream(new FileOutputStream("D://IOprimitive//data.txt"));
		
		in.writeInt(25);
		in.writeBoolean(true);
		in.writeChar('m');
		in.writeShort(2);
		in.writeDouble(10.11);	
		System.out.println("sucess");
		
		in.close();
	}
}
