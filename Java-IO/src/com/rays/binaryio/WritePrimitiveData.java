package com.rays.binaryio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class WritePrimitiveData {

	public static void main(String[] args) throws Exception {
		
		DataInputStream out = new DataInputStream(new FileInputStream("D://IOprimitive//data.txt"));
		
		 int i = out.readInt();
		 System.out.println(i);
		 System.out.println(out.readBoolean());
		 System.out.println(out.readChar());
		 System.out.println(out.readShort());
		 System.out.println(out.readDouble());
		
		out.close();
	}
}
