package com.java.exception2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] sumOfNumbers = { 1, 2, 3, 4 };
		int key = 2;
		process(sumOfNumbers, key, (v, k) -> System.out.println(v + k));
	}

	private static void process(int[] sumOfNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : sumOfNumbers) {
			consumer.accept(i, key);
		}
	}
}
