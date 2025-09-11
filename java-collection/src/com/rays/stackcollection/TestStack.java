package com.rays.stackcollection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		
		Stack s = new Stack();
		
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.push('e');
		
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		
	}
	
}
