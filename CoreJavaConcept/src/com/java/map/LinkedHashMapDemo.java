//Insertion order is preserved in linkedhashmap
package com.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] arg) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "cashapona");
		map.put(3, "arosys");
		map.put(2, "techment");

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
