package com.java.map;

import java.util.Map;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] arg) {
		Map<Integer, String> value = Map.of(1, "Ruturaj", 2, "rahul", 3, "vinendra");
		Set<Integer> keys = value.keySet();
		for (Integer i : keys) {
			System.out.println(i + " " + value.get(i));
		}
	}
}
