package com.libmgmt.controller;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libmgmt.model.Book;
import com.libmgmt.service.BookService;
import com.libmgmt.service.BookServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class BookControllerTest {

	@Configuration
	static class Config {
		@Bean
		public BookService bookService() {
			BookService bookService = new BookServiceImpl();
			return bookService;
		}
	}

	@Autowired
	BookService bookService;

	@Test
	public void findBookById() throws Exception {
		Assert.assertEquals(bookService.findById(1).getAuthor(), "Andrew");
		System.out.println(bookService.findById(1).getAuthor());

	}

	@Test
	public void createBook() throws Exception {
		Book book3 = new Book();
		book3.setId(3);
		book3.setAuthor("Ravi");
		book3.setName("PHP");
		book3.setPrice(10.0f);
		bookService.saveBook(book3);
		Assert.assertEquals(bookService.findById(3).getAuthor(), "Ravi");
	}

}