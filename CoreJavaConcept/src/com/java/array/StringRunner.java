package com.java.array;

public class StringRunner {
	public static void main(String[] arg) {
		String[] daysOfWeek = { "sunday", "monday", "Tuesday", "wednesday", "Thursday", "Friday", "saturday" };
		String dayWithMostCharacters = " ";
		for (String day : daysOfWeek)
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		System.out.println("Day with most character " + dayWithMostCharacters);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}
}
