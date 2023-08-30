package com.bhabanisjena.mockito.test_doubles.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


public class MockTest {

	@Test
	public void demoMock()
	{
		BookRepositoryMock bookRepositoryMock = new BookRepositoryMock();
		BookService bookService = new BookService(bookRepositoryMock);
		
		Book book1 = new Book("1234", "Mockito In Action", 550, LocalDate.now());
		Book book2 = new Book("1235", "JUnit 5 In Action", 500, LocalDate.now());
		
		bookService.addBook(book1); // return
		bookService.addBook(book2); // 
		
		bookRepositoryMock.verify(book2, 1);		
	}
}
