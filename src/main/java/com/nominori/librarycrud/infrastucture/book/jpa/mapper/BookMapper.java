package com.nominori.librarycrud.infrastucture.book.jpa.mapper;

import com.nominori.librarycrud.core.book.Book;
import com.nominori.librarycrud.infrastucture.book.jpa.BookJPAEntity;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookJPAEntity fromDomainToJPA(Book book) {
        BookJPAEntity bookJPAEntity = BookJPAEntity.builder()
                .title(book.getBookTitle().getValue())
                .bookAuthor(book.getBookAuthor().getValue())
                .build();

        bookJPAEntity.setId(book.getBookId().getValue());

        return bookJPAEntity;
    }

    public Book fromJPAToDomain(BookJPAEntity bookJPAEntity) {
        Book book = new Book();
        book.setBookId(new Book.BookId(bookJPAEntity.getId()));
        book.setBookTitle(new Book.BookTitle(bookJPAEntity.getTitle()));
        book.setBookAuthor(new Book.BookAuthor(bookJPAEntity.getBookAuthor()));

        return book;
    }
}
