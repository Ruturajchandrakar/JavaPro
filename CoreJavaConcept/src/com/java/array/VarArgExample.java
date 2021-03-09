package com.java.array;

public class VarArgExample {
	public int sum(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

	public static void main(String[] arg) {
		VarArgExample var = new VarArgExample();
		int sum2 = var.sum(1, 2);
		System.out.println("sum 2 = " + sum2);

		int sum3 = var.sum(1, 2, 3);
		System.out.println("sum 3 = " + sum3);

		int sum4 = var.sum(1, 2, 3, 4);
		System.out.println("sum 4 = " + sum4);
	}
}
