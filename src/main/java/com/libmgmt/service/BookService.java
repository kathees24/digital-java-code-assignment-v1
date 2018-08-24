package com.libmgmt.service;

import java.util.List;

import com.libmgmt.model.Book;

/**
 * @author kathees
 * 
 */
public interface BookService {

	/**
	 * Find the book based on id.
	 * 
	 * @param id
	 * @return
	 */
	public Book findById(long id);

	/**
	 * Find book based on book name.
	 * 
	 * @param bookName
	 * @return
	 */
	public Book findByName(String bookName);

	/**
	 * Save the book.
	 * 
	 * @param book
	 */
	public void saveBook(Book book);

	/**
	 * Update the book.
	 * 
	 * @param book
	 */
	public void updateBook(Book book);

	/**
	 * Delete the book based on the id.
	 * 
	 * @param id
	 */
	public void deleteBookById(long id);

	/**
	 * Find all books.
	 * 
	 * @return
	 */
	public List<Book> findAllBooks();

	/**
	 * Delete all books.
	 */
	public void deleteAllBooks();

	/**
	 * Check whether book is exist.
	 * 
	 * @param Book
	 * @return
	 */
	public boolean isBookExist(Book Book);

}
