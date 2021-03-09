package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomizeSorting2 {
	public static void main(String[] arg) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(1, 55));
		student.add(new Student(2, 51));
		student.add(new Student(3, 58));
		student.add(new Student(4, 65));
		student.add(new Student(5, 95));

		Collections.sort(student, (s1, s2) -> {
			return s1.mark > s2.mark ? -1 : s1.mark < s2.mark ? 1 : 0;
		});

		for (Student s : student) {
			System.out.println(s);
		}
	}
}

class Student {
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
}
