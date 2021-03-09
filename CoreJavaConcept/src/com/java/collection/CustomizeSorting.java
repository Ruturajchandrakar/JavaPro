package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CustomizeSorting {
	public static void main(String[] arg) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
		}

		Collections.sort(list, (o1, o2) -> {
			return o1 % 10 > o2 % 10 ? 1 : o1 % 10 < o2 % 10 ? -1 : 0;
		});

		for (Integer value : list) {
			System.out.println(value);
		}
	}
}