package com.raj.oops.Inheritance2;

public class Employee {
	private String college;
	private String classOfStudent;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getClassOfStudent() {
		return classOfStudent;
	}

	public void setClassOfStudent(String classOfStudent) {
		this.classOfStudent = classOfStudent;
	}

	@Override
	public String toString() {
		return college + "#" + classOfStudent + "#";
	}
}
