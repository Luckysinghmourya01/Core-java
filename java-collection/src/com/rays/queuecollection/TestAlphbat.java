package com.rays.queuecollection;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestAlphbat {

	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		for(char i ='a'; i<='z'; i++) {
			
			q.offer(i);
			
		}
		System.out.println(q);
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			
		}
		
	}
}
