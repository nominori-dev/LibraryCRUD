package com.nominori.librarycrud.infrastucture.book.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookJPARepository extends JpaRepository<BookJPAEntity, Long> {

    Optional<BookJPAEntity> findBookJPAEntityByTitle(String title);
    Optional<BookJPAEntity> findBookJPAEntityByBookAuthor(String bookAuthor);

}
