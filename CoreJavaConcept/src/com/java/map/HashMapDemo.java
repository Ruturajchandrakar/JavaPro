//its gives the value in random,it means insertion order is not preserved 
package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "raja");
		map.put(3, "rishabh");
		map.put(2, "rahul");

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
