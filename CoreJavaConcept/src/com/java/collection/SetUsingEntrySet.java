package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetUsingEntrySet {
	public static void main(String[] arg) {
		Map<String, String> map = new HashMap<>();
		map.put("firstname", "raja");
		map.put("lastname", "chandrakar");

		Set<Map.Entry<String, String>> values = map.entrySet();

		for (Map.Entry<String, String> e : values) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
