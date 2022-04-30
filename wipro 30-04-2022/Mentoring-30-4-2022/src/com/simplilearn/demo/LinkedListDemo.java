package com.simplilearn.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);//duplicated are allowed
		list.add(40);
		System.out.println(list);
		
		
		list.remove(3);
		
		System.out.println("After Remove :"+list);
		System.out.println("Size: "+list.size());
		
		list.add(3,10);
		
		System.out.println("After Add: "+list);
		System.out.println("Size :"+list.size());
		
		
		System.out.println("Get element from index 4: "+list.get(4));
		
		
		//Iterator to iterate with Data
		
		Iterator<Integer> retrive= list.iterator();
		while(retrive.hasNext()) {
			System.out.println(retrive.next());
		}
	}

}
