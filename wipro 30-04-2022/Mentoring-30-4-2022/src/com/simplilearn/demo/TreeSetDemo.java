package com.simplilearn.demo;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Nikunj");
		set.add("pooja");
		set.add("Nikunj");
		//set.add(null);//do not allows null value 
		set.add("Krishna");
		set.add("Krishna");
		
		System.out.println(set);
		
		set.remove("pooja");
		
		System.out.println(set);
		
		System.out.println("Size of a set:" +set.size());
	}

}
