package com.java.threading.ImplementingRunnable;

class Hi implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hiii");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemoByExtendingThreadClass {
	public static void main(String[] arg) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
