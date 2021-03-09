package com.java.threading.ExtendingThread;

public class ThreadDemo {
	public static void main(String[] arg) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());

		t1.join();
		t2.join();

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println("Bye");
	}
}
