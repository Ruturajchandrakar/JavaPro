package com.java.java8DefiningInterface;

public class Villain implements Actor {

	@Override
	public void act() {
		System.out.println("I know acting");
	}

	@Override
	public void speak() {
		System.out.println("I know speaking");
	}

	public void rude() {
		System.out.println("I am very rude");
	}

	public static void main(String[] arg) {
		Villain v = new Villain();
		v.act();
		v.speak();
		v.rude();
	}
}
