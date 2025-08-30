package com.Book.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.Entity.Book;
import com.Book.Repository.BookRepo;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> book = bookRepo.findById(id);
        if (book.isPresent()) {   
            return bookRepo.save(updatedBook);
        }
        return null;   
    }


    @Override
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
