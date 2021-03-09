package com.java.collection;

import java.util.Random;

public class EnhanceForLoop {
	public static void main(String[] arg) {
		int[] num = new int[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			num[i] = r.nextInt(50);
		}

		for (int i : num) {
			System.out.println(i);
		}
	}
}
