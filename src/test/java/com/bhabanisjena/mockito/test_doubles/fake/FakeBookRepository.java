package com.bhabanisjena.mockito.test_doubles.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository 
{
	Map<String, Book> bookStore = new HashMap<>();

	public void save(Book book) 
	{
		bookStore.put(book.getBookId(), book);
	}
    public Collection<Book> findAll() {
		return bookStore.values();
	}
	
	
}
