package com.nominori.librarycrud.infrastucture.book.jpa;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookJPAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String bookAuthor;

}
