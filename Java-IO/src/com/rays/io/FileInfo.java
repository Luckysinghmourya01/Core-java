package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		
		File f = new File("C:\\\\Users\\\\lucky singh mourya\\battery-report.html");
	
		if(f.exists()) {
			
			System.out.println("file found");
			
			System.out.println("file name: "+ f.getName());
			System.out.println("file path: "+ f.getAbsolutePath());
			System.out.println("write: "+ f.canWrite());
			System.out.println("read: "+ f.canRead());
			System.out.println("is file: "+ f.isFile());
			System.out.println("directory: "+ f.isDirectory());
			
			System.out.println("---------- check last date ------------");
			
			Date d = new Date(f.lastModified()); 
			System.out.println(d);
			
			System.out.println("----------- check length ----------");
			long length = f.length();
			System.out.println("length: " +length + " bytes");
		}
		
		else {
			System.out.println("file are not found");
		}
		
	}
}
