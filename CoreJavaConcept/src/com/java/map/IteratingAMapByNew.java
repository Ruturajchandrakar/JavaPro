package com.java.map;

import java.util.Map;

public class IteratingAMapByNew {
	public static void main(String[] arg) {
		Map<Integer, String> map = Map.of(1, "tcs", 2, "wipro", 3, "oracle");
		for (Map.Entry<Integer, String> value : map.entrySet()) {
			System.out.println(value.getKey() + " " + value.getValue());
		}
	}
}
