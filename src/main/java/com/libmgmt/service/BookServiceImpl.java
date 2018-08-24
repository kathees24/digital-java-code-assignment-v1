package com.libmgmt.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.libmgmt.model.Book;

/**
 * @author kathees
 * 
 */
@Service
public class BookServiceImpl implements BookService {

	private static final AtomicLong counter = new AtomicLong();

	private static List<Book> books;

	static {
		init();
	}

	/**
	 * Initialize the dummy data.
	 */
	private static void init() {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(counter.incrementAndGet(), "Java", "Andrew",
				100.0f));
		bookList.add(new Book(counter.incrementAndGet(),
				"Data Structure & Algorithm", "John", 200.f));
		books = bookList;
	}

	/**
	 * Find the book by passing book id.
	 */
	public Book findById(long id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	/**
	 * Save the book
	 */
	public void saveBook(Book book) {
		book.setId(counter.incrementAndGet());
		books.add(book);
	}

	/**
	 * Update the book
	 */
	public void updateBook(Book book) {
		int index = books.indexOf(book);
		books.set(index, book);
	}

	/**
	 * Delete the book by passing book id.
	 */
	public void deleteBookById(long id) {
		for (Iterator<Book> iter = books.iterator(); iter.hasNext();) {
			Book book = iter.next();
			if (book.getId() == id) {
				iter.remove();
			}
		}
	}

	/**
	 * Find the all books
	 */
	public List<Book> findAllBooks() {
		return books;
	}

	/**
	 * Delete all books
	 */
	public void deleteAllBooks() {
		books.clear();
	}

	/**
	 * Check whether the book is exist.
	 */
	public boolean isBookExist(Book book) {
		return findByName(book.getName()) != null;
	}

	/**
	 * Find the book by passing book name
	 */
	public Book findByName(String bookName) {
		for (Book book : books) {
			if (book.getName().equalsIgnoreCase(bookName)) {
				return book;
			}
		}
		return null;
	}
}
