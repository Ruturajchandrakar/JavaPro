package com.java.exception;

public class TryCatchDemo {
	public static void main(String[] arg) {
		int i, j, k = 0;
		int[] a = new int[4];
		i = 8;
		j = 2;
		try {
			k = i / j;
			for (int c = 0; c <= 4; c++) {
				a[c] = c + 1;
			}
			for (int value : a) {
				System.out.println(value);
			}
		}

		catch (ArithmeticException e) {
			System.out.println("can not devide by zero " + e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("minimum no of value is 4");
		}

		catch (Exception e) {
			System.out.println("Unknown Exception");
		}
		System.out.println(k);

	}
}
