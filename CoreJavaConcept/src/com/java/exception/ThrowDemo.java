package com.java.exception;

import java.util.Scanner;

public class ThrowDemo {
	public static void main(String[] arg) {
		int i = 10;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		try {
			if (j < i) {
				throw new ArithmeticException();
			}
		}

		catch (ArithmeticException e) {
			System.out.println("Enter big no");
		} catch (Exception e) {
			System.out.println("Enter big no");
		}
	}
}
