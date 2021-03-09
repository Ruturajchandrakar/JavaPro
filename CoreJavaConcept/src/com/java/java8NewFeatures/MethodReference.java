package com.java.java8NewFeatures;

import java.util.List;

public class MethodReference {
	public static void main(String[] arg) {
		List<Integer> value = List.of(1, 2, 3, 4, 5);
		// print list using method reference
		System.out.println("Printing the List value ");
		value.forEach(System.out::println);

		// print list using method reference
		System.out.println("Printing the Doubleit value");
		value.forEach(MethodReference::doubleit);
	}

	public static void doubleit(int i) {
		System.out.println(i * 2);
	}
}
