package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity

@Table(schema="dbo",name="Libri")
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
    @Column(name="totalCopies")
    private Integer totalCopies;
    @Column(name="availableCopies")
    private Integer availableCopies;
}
