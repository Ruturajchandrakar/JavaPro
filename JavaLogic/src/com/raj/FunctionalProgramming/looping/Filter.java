package com.raj.FunctionalProgramming.looping;

import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cat");
		printWithFp(list);
	}

	private static void printWithFp(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element - " + element));

	}


}
