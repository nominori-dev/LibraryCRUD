package com.nominori.librarycrud.infrastucture.book.jpa.mapper;

import com.nominori.librarycrud.core.book.Book;
import com.nominori.librarycrud.infrastucture.book.jpa.BookJPAEntity;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookJPAEntity of(Book book){
        return BookJPAEntity.builder()
                .title(book.getBookTitle().getValue())
                .bookAuthor(book.getBookAuthor().getValue())
                .build();
    }

    public Book of(BookJPAEntity bookJPAEntity){
        return new Book(new Book.BookId(bookJPAEntity.getId()),
                        new Book.BookTitle(bookJPAEntity.getTitle()),
                        new Book.BookAuthor(bookJPAEntity.getBookAuthor()));
    }

}
