package com.java.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
	public static void main(String[] arg) {
		List<Person> person = Arrays.asList(new Person("Raja", "chandrakar", 21), new Person("vinu", "sinha", 23),
				new Person("moto", "sahu", 21));

		// for each
		System.out.println("The records are");
		person.stream().forEach(p -> System.out.println(p.getFirstName()));

		// filter
		System.out.println("Sirname starting with c");
		person.stream().filter(p -> p.getLastName().startsWith("c")).forEach(p -> System.out.println(p.getFirstName()));

		// count
		System.out.println("total sirname starting with s");
		long count = person.stream().filter(p -> p.getLastName().startsWith("s")).count();
		System.out.println(count);
	}
}
