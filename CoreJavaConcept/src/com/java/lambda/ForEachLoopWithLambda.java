package com.java.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachLoopWithLambda {
	public static void main(String[] arg) {
		List<Person> person = Arrays.asList(new Person("raja", "chandrakar", 21), new Person("dadu", "chandrakar", 22),
				new Person("vinu", "sinha", 21));

		System.out.println("Using for loop");
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i));
		}

		System.out.println("Using for in loop");
		for (Person p : person) {
			System.out.println(p);
		}

		System.out.println("Using lambda foreach loop");
		person.forEach(p -> System.out.println(p));
	}
}
