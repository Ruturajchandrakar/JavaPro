package com.java.lambda;

public class StringLength {

	public static void main(String[] arg) {
		StringLengthLambda myLambda = (s) -> s.length();
		System.out.println(myLambda.getLenth("Hello world"));
	}

	interface StringLengthLambda {
		int getLenth(String s);
	}
}
