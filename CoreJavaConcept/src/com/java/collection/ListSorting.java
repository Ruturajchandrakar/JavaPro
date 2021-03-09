package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListSorting {
	public static void main(String[] arg) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			list.add(random.nextInt(1000));
		}

		Collections.sort(list);

		for (Integer o : list) {
			System.out.println(o);
		}
	}
}
