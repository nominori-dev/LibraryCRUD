package com.nominori.librarycrud.application.config;

import com.nominori.librarycrud.core.book.persistence.BookPersistenceProvider;
import com.nominori.librarycrud.core.book.persistence.repository.BookRepository;
import com.nominori.librarycrud.core.book.persistence.service.BookProcessingService;
import com.nominori.librarycrud.core.book.persistence.service.BookQueryService;
import com.nominori.librarycrud.infrastucture.book.jpa.BookRepositoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CoreBeanConfiguration {

    private final BookRepositoryAdapter bookRepositoryAdapter;

    @Bean
    BookPersistenceProvider bookPersistenceProvider(BookRepository bookRepository){
        return new BookPersistenceProvider(bookRepositoryAdapter);
    }

    @Bean
    BookProcessingService bookProcessingService(BookPersistenceProvider persistenceProvider){
        return new BookProcessingService(persistenceProvider);
    }

    @Bean
    BookQueryService bookQueryService(BookPersistenceProvider persistenceProvider){
        return new BookQueryService(persistenceProvider);
    }

}
