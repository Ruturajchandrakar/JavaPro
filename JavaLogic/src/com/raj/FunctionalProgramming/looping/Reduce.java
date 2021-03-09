package com.raj.FunctionalProgramming.looping;

import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		List<Integer> list = List.of(4, 5, 6, 2, 8);
		int sum = list.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
	}
}
