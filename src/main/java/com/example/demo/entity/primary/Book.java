package com.example.demo.entity.primary;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity

@Table(schema="dbo",name="library_books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="author")
    private String author;
    @Column(name="genre")
    private String genre;
    @Column(name="total_copies")
    private Integer totalCopies;
    @Column(name="available_copies")
    private Integer availableCopies;
}
