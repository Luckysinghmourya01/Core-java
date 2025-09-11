package com.rays.stackcollection;

import java.util.Stack;

public class TestStackAlphbat {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for(char i='a'; i<='z'; i++) {
			
			s.push(i);
		}
		System.out.println(s);
		while(!s.empty()) {
			System.out.println(s.pop());
		}
	}
}
