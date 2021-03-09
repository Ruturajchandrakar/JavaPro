package com.raj.oops.Interface;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("goes up");

	}

	@Override
	public void down() {
		System.out.println("goes down");

	}

	@Override
	public void left() {
		System.out.println("goes left");
	}

	@Override
	public void right() {
		System.out.println("go right");

	}

}
