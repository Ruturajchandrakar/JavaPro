package com.raj.oops.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "hello ruturaj";
		Map<Character, Integer> charOccurences = new HashMap<>();
		char[] characters = str.toCharArray();

		for (char character : characters) {
			Integer integer = charOccurences.get(character);
			if (integer == null) {
				charOccurences.put(character, 1);
			} else {
				charOccurences.put(character, integer + 1);
			}
		}
		System.out.println(charOccurences);
	}

}
