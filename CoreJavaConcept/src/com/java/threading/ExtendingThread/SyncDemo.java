package com.java.threading.ExtendingThread;

class Demo {
	int count;

	synchronized void increment() {
		count++;
	}
}

public class SyncDemo {
	public static void main(String[] arg) throws Exception {
		Demo c = new Demo();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Count " + c.count);
	}
}