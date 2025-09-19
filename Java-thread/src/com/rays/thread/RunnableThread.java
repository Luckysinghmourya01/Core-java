package com.rays.thread;

public class RunnableThread implements Runnable {

	private String name;
	private int marks;
	
	public RunnableThread(String name , int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+ "=" + name + " marks: " + marks);
		}
	}
}
