package com.rays.queuecollection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
// priority queue me jo data shuru me add hota vesa hi data add hona chahiye int to int type ka
public class TestPriorityQueue {

	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.add(10);
		q.add(9);
		q.add(8);
		q.add(7);
		q.add(6);
		q.add(5);
		
				
		System.out.println(q);
		
		
	}
}
