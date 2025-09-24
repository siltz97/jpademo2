package com.example.demo.entity.primary;

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
    @Column(name="genre")
    private String genre;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Author mainAuthor;
}
