package com.java.array;

import java.util.Arrays;

public class ArrayIterationUsingForEachLoop {
	public static void main(String[] args) {
		int sum = 0;
		int[] marks = { 3, 2, 1 };
		for (int mark : marks) {
			sum = sum + mark;
		}
		System.out.println(Arrays.toString(marks));
		System.out.println("sum is " + sum);
	}
}
