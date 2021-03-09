package com.raj.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "oop", "raja");
		book.addReview(new Review(1, "Good book", 5));
		System.out.println(book);
	}

}
