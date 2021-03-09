package com.java.java8NewFeatures;

import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] arg) {
		List<Integer> list = List.of(5, 4, 3, 2, 1);
		// External Iteration
		System.out.println("External Iteration");
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// Internal Iteration
		System.out.println("Internal Iteration");
		list.forEach(j -> System.out.println(j));

	}
}
