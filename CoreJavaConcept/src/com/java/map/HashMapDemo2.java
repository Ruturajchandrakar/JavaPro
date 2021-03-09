package com.java.map;

import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] arg) {
		Map<Integer, String> map = Map.of(1, "virat", 2, "rohit", 3, "dhoni");

		// iterate through key only
		for (Integer value : map.keySet()) {
			System.out.println(value);
		}

		// iterate through value only
		for (String value : map.values()) {
			System.out.println(value);
		}

		// iterate through key/value
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}
}
