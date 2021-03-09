package com.java.map;

import java.util.Comparator;
import java.util.Map;

public class MapStreamDemo2 {
	public static void main(String[] arg) {
		Map<Integer, String> map = Map.of(1, "Ibm", 2, "hp", 3, "dell");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}
}
