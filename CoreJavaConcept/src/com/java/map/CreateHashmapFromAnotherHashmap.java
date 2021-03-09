package com.java.map;

import java.util.HashMap;

public class CreateHashmapFromAnotherHashmap {
	public static void main(String[] arg) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "tcs");
		map.put(2, "wipro");
		map.put(3, "capgemini");
		System.out.println(map);

		HashMap<Integer, String> map2 = new HashMap(map);
		map2.put(4, "ibm");
		System.out.println(map2);
	}
}
