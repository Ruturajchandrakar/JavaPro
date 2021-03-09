package com.raj.oops.Inheritance2;

import java.math.BigDecimal;

public class Person extends Employee {
	private String title;
	private String employerName;
	private char employeeCode;
	private BigDecimal salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(char employeeCode) {
		this.employeeCode = employeeCode;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + employeeCode + "#";
	}

}
