package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);//duplicate values are allowed
		list.add(40);
		
		System.out.println(list);
		System.out.println("size:"+list.size());
		
		list.remove(3);
		
		System.out.println("After Remove "+ list);
		
		System.out.println("size after remove:"+list.size());
		
		list.add(3,10);//at index 3 we have added 10 
		System.out.println("After Add "+ list);
		
		
	    System.out.println("Get Element from index 4: "+list.get(4));
	    
	    
	    ///iterator to iterate with data
	    
	    Iterator<Integer> retrive= list.iterator();
	    
	    while(retrive.hasNext()) {
	    	System.out.println(retrive.next());
	    }
		
		
		
		 

	}

}
