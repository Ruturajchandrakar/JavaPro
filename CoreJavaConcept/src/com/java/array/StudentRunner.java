package com.java.array;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] arg) {
		int[] marks = { 95, 92, 96 };

		Student student = new Student("Raja", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks " + number);

		int sum = student.getTotalMarks();
		System.out.println(sum);

		int max = student.getMaaximumMarks();
		System.out.println("maximum mark " + max);

		int min = student.getMinimumMarks();
		System.out.println("minimum mark " + min);

		BigDecimal average = student.getAverageMark();
		System.out.println("average " + average);
	}

}
