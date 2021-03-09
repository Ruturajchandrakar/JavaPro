package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] arg) {
		Map<String, String> map = new HashMap<>();
		map.put("firstname", "raja");
		map.put("lastname", "chandrakar");

		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
