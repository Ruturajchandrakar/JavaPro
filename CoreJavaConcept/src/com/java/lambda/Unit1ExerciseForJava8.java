package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseForJava8 {
	public static void main(String[] arg) {
		List<Person> person = Arrays.asList(new Person("raja", "cndrakar", 21), new Person("cinu", "cahu", 21),
				new Person("rishabh", "sahu", 21), new Person("dolu", "sahu", 25));

		// step 1: sort list by lastname
		Collections.sort(person, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// step 2:create a method that prints all elements in the list
		System.out.println("Print All person ");
		printConditionally(person, p -> true, p -> System.out.println(p));

		// step 3: print all people that have last name begining with c
		System.out.println("Print All Person Lastname starting with c");
		printConditionally(person, p -> p.getLastName().startsWith("c"), p -> System.out.println(p));

		// step 4: print all people that have last name begining with c
		System.out.println("Print All Person Firstname starting with c");
		printConditionally(person, p -> p.getFirstName().startsWith("c"), p -> System.out.println(p));
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
