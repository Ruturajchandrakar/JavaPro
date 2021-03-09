package com.java.lambda;

public class MethodReference {
	public static void main(String[] arg) {
		Thread t = new Thread(MethodReference::printMessage); // MethodReference::printMessage === () -> printMessage()
		t.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}
}
