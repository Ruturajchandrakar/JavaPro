package com.java.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSorting {
	public static void main(String[] arg) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(1, 55));
		student.add(new Student(2, 51));
		student.add(new Student(3, 58));
		student.add(new Student(4, 65));
		student.add(new Student(5, 95));

		Collections.sort(student);

		for (Student s : student) {
			System.out.println(s);
		}
	}
}

class Student implements Comparable<Student> {
	int rollno;
	int mark;

	public Student(int rollno, int mark) {
		this.rollno = rollno;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.mark > s.mark ? -1 : this.mark < s.mark ? 1 : 0;
	}
}
