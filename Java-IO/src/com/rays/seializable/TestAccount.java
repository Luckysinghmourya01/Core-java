package com.rays.seializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestAccount {

	public static void main(String[] args) throws Exception, IOException {

		Account a = new Account("255237296", 5457.66);

		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D://IOserilizable//account.txt"));

		o.writeObject(a);

		o.close();

		System.out.println("write sucessfully");

		System.out.println("data deserilizale");

		ObjectInputStream i = new ObjectInputStream(new FileInputStream("D://IOserilizable//account.txt"));

		a = (Account) i.readObject();
		System.out.println(a);

		i.close();
	}
}
