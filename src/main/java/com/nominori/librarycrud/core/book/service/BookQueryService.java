package com.nominori.librarycrud.core.book.service;

import com.nominori.librarycrud.core.book.Book;
import com.nominori.librarycrud.core.book.persistence.BookPersistenceProvider;
import com.nominori.librarycrud.core.book.usecase.FindBook;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BookQueryService implements FindBook {

    private final BookPersistenceProvider persistenceProvider;

    @Override
    public Book findById(Book.BookId bookId) {
        return persistenceProvider.findById(bookId);
    }

    @Override
    public Book findByTitle(Book.BookTitle bookTitle) {
        return persistenceProvider.findByTitle(bookTitle);
    }

    @Override
    public List<Book> findAll() {
        return persistenceProvider.findAll();
    }
}
