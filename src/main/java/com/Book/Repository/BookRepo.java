package com.Book.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.Entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
