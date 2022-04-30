package com.simplilearn.demo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
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
