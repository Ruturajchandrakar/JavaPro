package com.java.java8DefiningInterface;

public class Hero implements Actor {

	@Override
	public void act() {
		System.out.println("I know acting");

	}

	@Override
	public void speak() {
		System.out.println("I know speaking");
	}

}
