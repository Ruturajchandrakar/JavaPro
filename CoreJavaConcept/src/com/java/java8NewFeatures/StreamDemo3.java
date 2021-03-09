package com.java.java8NewFeatures;

import java.util.List;

public class StreamDemo3 {
	public static void main(String[] arg) {
		List<Integer> value = List.of(13, 20, 35, 40, 50);
		System.out.println(value.stream().filter(i -> i % 5 == 0).map(i -> i * 2).findFirst().orElse(0));
	}
}
