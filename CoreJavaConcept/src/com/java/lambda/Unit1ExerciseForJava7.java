package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseForJava7 {
	public static void main(String[] arg) {
		List<Person> person = Arrays.asList(new Person("raja", "cndrakar", 21), new Person("cinu", "cahu", 21),
				new Person("rishabh", "sahu", 21), new Person("dolu", "sahu", 25));

		// step 1: sort list by lastname
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// step 2: create a method that prints all elements in the list
		System.out.println("Print All person ");
		printAll(person);

		// step 3: print all people that have last name begining with c
		System.out.println("Print All Person Lastname starting with c");
		printConditionally(person, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("c");
			}

		});

		// step 4: print all people that have last name begining with c
		System.out.println("Print All Person Firstname starting with c");
		printConditionally(person, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("c");
			}

		});
	}

	private static void printConditionally(List<Person> person, Condition condition) {
		for (Person p : person) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Person> person) {
		for (Person p : person) {
			System.out.println(p);
		}
	}

}

interface Condition {
	boolean test(Person p);
}
