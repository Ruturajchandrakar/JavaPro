package com.raj.oops;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("sr nagar", "hyderabad", "493885");
		Customer customer = new Customer("Ranga", homeAddress);

		Address workAddress = new Address("madhapur", "hyderabad", "493665");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
