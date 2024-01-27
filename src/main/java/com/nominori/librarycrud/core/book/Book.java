package com.nominori.librarycrud.core.book;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private BookId bookId;
    private BookTitle bookTitle;
    private BookAuthor bookAuthor;



    @Data
    public static class BookId {
        private final Long value;
    }

    @Data
    public static class BookTitle {
        private final String value;
    }

    @Data
    public static class BookAuthor {
        private final String value;
    }
}
