//When we use tree map its values are sorted according to key
package com.java.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] arg) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(3, "techment");
		map.put(1, "wipro");
		map.put(2, "tcs");

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
