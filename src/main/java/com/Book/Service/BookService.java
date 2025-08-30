package com.Book.Service;

import java.util.List;

import com.Book.Entity.Book;

public interface BookService {
    
    Book saveBook(Book book);
    Book getBookById(Long id);
    List<Book> getAllBooks();
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}
