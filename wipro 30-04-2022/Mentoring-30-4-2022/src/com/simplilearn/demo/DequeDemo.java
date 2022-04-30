package com.simplilearn.demo;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	
	
	//deque:insertion and deletion happened from both the ends
	//linked list implementing deque interface
	
	public static void main(String[] args) {
		
		Deque<Integer> dq= new LinkedList<Integer>();
		
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		
		System.out.println("Deque: "+dq);
		
		dq.pollFirst();
		System.out.println("After the first poll"+dq);
		
		dq.pollLast();
		System.out.println("After the last poll"+dq);
		
		dq.add(50);
		System.out.println("After add"+dq);
		
		dq.addFirst(90);
		System.out.println("After add first"+dq);
		
		dq.addLast(100);
		System.out.println("After last add"+dq);
		
		System.out.println("size: "+dq.size());
		
		
		
		
	}

}
