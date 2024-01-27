package com.nominori.librarycrud.core.book.usecase;

import com.nominori.librarycrud.core.book.Book;

import java.util.List;

public interface FindBook {

    Book findById(Book.BookId bookId);
    Book findByTitle(Book.BookTitle bookTitle);
    List<Book> findAll();


}
