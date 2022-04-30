package com.simplilearn.demo;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		///queue : insert element from one end and delete from another end
		//queue is interface----> implemented class is PriorityQueue
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println("Queue: "+pq);
		
		///print a top element
		
		System.out.println("Top Element: "+pq.peek());
		
		System.out.println(pq.poll());
		
		System.out.println("After Poll" +pq);
	}
}
