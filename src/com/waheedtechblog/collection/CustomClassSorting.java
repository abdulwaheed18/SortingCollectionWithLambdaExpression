/**
 * 
 */
package com.waheedtechblog.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Custom class sorting using lambda expression.
 * 
 * @author Abdul Waheed
 *
 */
class Book {

	private int bookId;
	private String bookName;

	public Book(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
}

public class CustomClassSorting {
	public static void main(String[] args) {

		Book book1 = new Book(205, "Java");
		Book book2 = new Book(300, "Python");
		Book book3 = new Book(300, "Spring framework");
		Book book4 = new Book(503, "Hibernate");

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);

		System.out.println("Book object natural Sorting\n" + books);

		Collections.sort(books,
				(b1, b2) -> (b1.getBookId() > b2.getBookId()) ? -1 : (b1.getBookId() < b2.getBookId()) ? 1 : 0);
		System.out.println("Book object after Sorting in DESC order\n" + books);
	}
}
