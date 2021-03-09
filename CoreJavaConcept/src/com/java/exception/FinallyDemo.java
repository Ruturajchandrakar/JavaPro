package com.java.exception;

import java.util.Scanner;

public class FinallyDemo {
	public static void main(String[] arg) {
		int i = 8;
		System.out.println("Enter nunber: ");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		try {
			int k = i / j;
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println("Can not devide by zero");
		}

		catch (Exception e) {
			System.out.println("Error generated");
		}

		finally {
			System.out.println("Finally block");
		}

	}
}
