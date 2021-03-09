package com.java.java8NewFeatures;

import java.util.List;

public class StreamDemo2 {
	public static void main(String[] arg) {
		List<Integer> value = List.of(10, 12, 15, 13, 20);

		// By using for in loop
		// This is external iteration
		System.out.println("Without using stream api");
		int result = 0;
		for (int i : value) {
			if (i % 5 == 0) {
				result += i;
			}
		}
		System.out.println(result);

		// By using Stream Api

		// this is internal iteration
		System.out.println("By using stream api");
		System.out.println(value.stream().filter(i -> i % 5 == 0).reduce(0, (c, e) -> c + e));
	}
}
