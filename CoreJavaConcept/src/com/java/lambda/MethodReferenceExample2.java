package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
	public static void main(String[] arg) {
		List<Person> person = Arrays.asList(new Person("raja", "cndrakar", 21), new Person("cinu", "cahu", 21),
				new Person("rishabh", "sahu", 21), new Person("dolu", "sahu", 25));

		// step 2:create a method that prints all elements in the list
		System.out.println("Print All person ");
		printConditionally(person, p -> true, System.out::println);// p -> method(p)
	}

	private static void printConditionally(List<Person> person, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : person) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}
}
