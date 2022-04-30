package com.simplilearn.demo;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		
		set.add("Nikunj");
		set.add("pooja");
		set.add("Nikunj");
		set.add(null);
		set.add("Krishna");
		set.add("Krishna");
		
		System.out.println(set);
		
		set.remove("pooja");
		
		System.out.println(set);
		
		System.out.println("Size of a set:" +set.size());
	}

}
