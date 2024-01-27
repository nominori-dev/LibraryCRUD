package com.nominori.librarycrud.core.book.service;

import com.nominori.librarycrud.core.book.Book;
import com.nominori.librarycrud.core.book.persistence.BookPersistenceProvider;
import com.nominori.librarycrud.core.book.usecase.AddBook;
import com.nominori.librarycrud.core.book.usecase.DeleteBook;
import com.nominori.librarycrud.core.book.usecase.UpdateBook;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class BookProcessingService implements AddBook, UpdateBook, DeleteBook {

    private final BookPersistenceProvider persistenceProvider;

    @Override
    public void addBook(Book book) {
        log.info("Adding new {} to the library.", book);
        persistenceProvider.storeBook(book);
    }

    @Override
    public void delete(Book book) {
        log.info("Removing book with ID: {}", book);
        persistenceProvider.deleteBook(book);
    }

    @Override
    public void updateTitle(Book book, Book.BookTitle newTitle) {
        log.info("Updating book title from {} to {}",
                book.getBookTitle().getValue(),
                newTitle.getValue());
        book.setBookTitle(newTitle);
        persistenceProvider.storeBook(book);
    }

    @Override
    public void updateAuthor(Book book, Book.BookAuthor newAuthor) {
        log.info("Updating book author from {} to {}",
                book.getBookAuthor().getValue(),
                newAuthor.getValue());
        book.setBookAuthor(newAuthor);
        persistenceProvider.storeBook(book);
    }
}
