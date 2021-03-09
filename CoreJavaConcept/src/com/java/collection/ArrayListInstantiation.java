package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInstantiation {
	public static void main(String[] arg) {
		List<Integer> list = new ArrayList<>()
		// first method of initialization
		// Arrays.asList(1, 2, 3, 4, 5);

		// second method of initialization
		{
			{
				add(6);
				add(7);
				add(8);
				add(9);
				add(10);
			}
		};
		for (int i : list) {
			System.out.println(i);
		}
	}
}
