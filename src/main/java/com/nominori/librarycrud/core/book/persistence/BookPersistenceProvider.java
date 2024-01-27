package com.nominori.librarycrud.core.book.persistence;

import com.nominori.librarycrud.core.book.Book;
import com.nominori.librarycrud.core.book.error.BookNotFound;
import com.nominori.librarycrud.core.book.persistence.repository.BookRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BookPersistenceProvider {

    private final BookRepository bookRepository;

    public void storeBook(Book book){
        bookRepository.save(book);
    }

    public Book findById(Book.BookId bookId){
       return bookRepository.findById(bookId)
               .orElseThrow(BookNotFound::new);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }

    public Book findByTitle(Book.BookTitle bookTitle) {
        return bookRepository.findByTitle(bookTitle)
                .orElseThrow(BookNotFound::new);
    }
}
