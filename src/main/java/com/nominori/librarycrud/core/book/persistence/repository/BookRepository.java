package com.nominori.librarycrud.core.book.persistence.repository;

import com.nominori.librarycrud.core.book.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    void save(Book book);
    Optional<Book> findById(Book.BookId id);
    List<Book> findAll();
    void delete(Book book);

    Optional<Book> findByTitle(Book.BookTitle bookTitle);
}
