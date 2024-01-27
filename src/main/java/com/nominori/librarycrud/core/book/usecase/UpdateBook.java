package com.nominori.librarycrud.core.book.usecase;

import com.nominori.librarycrud.core.book.Book;

public interface UpdateBook {

    void updateTitle(Book book, Book.BookTitle newTitle);
    void updateAuthor(Book book, Book.BookAuthor newAuthor);

}
