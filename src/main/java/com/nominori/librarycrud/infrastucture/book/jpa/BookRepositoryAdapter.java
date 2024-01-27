package com.nominori.librarycrud.infrastucture.book.jpa;

import com.nominori.librarycrud.core.book.Book;
import com.nominori.librarycrud.core.book.persistence.repository.BookRepository;
import com.nominori.librarycrud.infrastucture.book.jpa.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookRepositoryAdapter implements BookRepository {

    private final BookJPARepository bookJPARepository;
    private final BookMapper bookMapper;

    @Override
    public void save(Book book) {
        bookJPARepository.save(bookMapper.of(book));
    }

    @Override
    public Optional<Book> findById(Book.BookId id) {
        return Optional.ofNullable(bookMapper.of(
                bookJPARepository.findById(id.getValue()).get()));
    }

    @Override
    public List<Book> findAll() {
        return bookJPARepository.findAll().stream().map((bookMapper::of)).toList();
    }

    @Override
    public void delete(Book book) {
        bookJPARepository.delete(bookMapper.of(book));
    }

    @Override
    public Optional<Book> findByTitle(Book.BookTitle bookTitle) {
        return Optional.ofNullable(bookMapper.of(
                bookJPARepository.findBookJPAEntityByBookAuthor(bookTitle.getValue()).get()));
    }
}
