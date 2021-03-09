package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingAMap {
	public static void main(String[] arg) {
		Map map = new HashMap();
		map.put(1, "wipro");
		map.put(2, "tcs");
		map.put(3, "oacle");

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
