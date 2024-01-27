package com.nominori.librarycrud.application.rest;

import com.nominori.librarycrud.application.rest.dto.BookResponse;
import com.nominori.librarycrud.core.book.Book;
import com.nominori.librarycrud.core.book.service.BookQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {

    private final BookQueryService bookQueryService;

    @GetMapping("{id}")
    public BookResponse getBookById(@PathVariable Long id){
        Book book = bookQueryService.findById(new Book.BookId(id));

        return BookResponse.builder()
                .id(book.getBookId().getValue())
                .title(book.getBookTitle().getValue())
                .author(book.getBookAuthor().getValue())
                .build();
    }
}
