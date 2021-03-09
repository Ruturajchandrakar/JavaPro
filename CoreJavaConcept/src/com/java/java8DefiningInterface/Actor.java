package com.java.java8DefiningInterface;

public interface Actor {
	void act();

	void speak();

	default void comedy() {
		System.out.println("I know comedy");
	}
}
