package com.bhabanisjena.mockito.test_doubles.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


public class DummyTest 
{
	@Test
	public void testDummy()
	{
		BookRepository bookRepository = new FakeBookRepository();
		EmailService emailService = new DummyEmailService();
		BookService bookService = new BookService(bookRepository, emailService);
		
		bookService.addBook(new Book("1234", "Mockito In Action", 250, LocalDate.now()));
		bookService.addBook(new Book("1235", "JUnit5 In Action", 350, LocalDate.now()));
		
		assertEquals(2,bookService.findNumberOfBooks());
	}
}
