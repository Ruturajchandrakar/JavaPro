package com.java.map;

import java.util.HashMap;

public class ChangeHashmapValue {
	public static void main(String[] arg) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "tcs");
		map.put(2, "wipro");
		map.put(3, "ibm");
		System.out.println("Before replace " + map);

		map.replace(2, "hp");
		System.out.println("After replace " + map);

		String key = map.remove(3);
		System.out.println("removed value is " + key);
		System.out.println("After remove " + map);
	}
}
