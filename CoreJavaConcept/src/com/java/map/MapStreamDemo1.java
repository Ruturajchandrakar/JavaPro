package com.java.map;

import java.util.Map;

public class MapStreamDemo1 {
	public static void main(String[] arg) {
		Map<Integer, String> map = Map.of(3, "cashapona", 1, "ibm", 2, "birlasoft");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
}
