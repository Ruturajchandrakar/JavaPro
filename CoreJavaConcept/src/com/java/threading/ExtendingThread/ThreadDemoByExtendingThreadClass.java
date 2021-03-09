package com.java.threading.ExtendingThread;

class Hi extends Thread {
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

class Hello extends Thread {
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

		obj1.start();
		obj2.start();
	}
}
