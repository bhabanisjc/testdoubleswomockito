package com.bhabanisjena.mockito.test_doubles.spy;

public class BookService 
{
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	public void addBook(Book book)
	{
		bookRepository.save(book);
	}
	

	
}
