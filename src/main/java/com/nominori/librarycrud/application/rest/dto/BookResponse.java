package com.nominori.librarycrud.application.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BookResponse {
    private Long id;
    private String title;
    private String author;
}
