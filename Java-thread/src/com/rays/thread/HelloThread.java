package com.rays.thread;

public class HelloThread extends Thread{

	
		
		
       private String name;
       private int id;
       
       public HelloThread(String name , int id) {
		this.name = name;
		this.id = id;
	}
       
       @Override
    public void run() {
    	for(int i=1; i<=6; i++) {
    		
    		System.out.println(i + "=" + name + " Id:" + id);
    	}
    	
    }
       
		
	
}
