package com.java.java8NewFeatures;

import java.util.List;

public class StreamDemo1 {
	public static void main(String[] arg) {
		List<Integer> value = List.of(1, 2, 3, 4, 5);
		System.out.println(value.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
	}
}
