package com.java.exception;

public class UserDefinedExceptionDemo {
	public static void main(String[] arg) {
		int i = 5;
		try {
			if (i < 10) {
				throw new MyException("Error Generated");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class MyException extends Exception {

	public MyException(String msg) {
		super(msg);
	}

}
