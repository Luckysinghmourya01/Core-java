package com.rays.seializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class testEmpolyeExternalizable {

	public static void main(String[] args) throws Exception, Exception {
		
		EmployeExternalizable e = new EmployeExternalizable("aman" , 102 , "30000");
		
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D://IOserilizable//empolye.txt"));
		
		o.writeObject(e);
		System.out.println("write sucess");
		
		o.close();
		
		System.out.println("data deserilizable");
		
		ObjectInputStream i = new ObjectInputStream(new FileInputStream("D://IOserilizable//empolye.txt"));
		
		System.out.println(i.readObject());
	}
}
