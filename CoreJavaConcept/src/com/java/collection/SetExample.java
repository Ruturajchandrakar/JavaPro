package com.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] arg) {
		Set<Integer> set = new TreeSet<>();
		set.add(5);
		set.add(8);
		set.add(16);
		set.add(1);

		for (int i : set) {
			System.out.println(i);
		}
	}
}
