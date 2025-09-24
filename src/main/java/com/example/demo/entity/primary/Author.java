package com.example.demo.entity.primary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(schema="dbo",name="authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;

    @Column(name="name")
    private String firstName;

    @Column(name="surname")
    private String lastName;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, mappedBy = "mainAuthor")
    private List<Book> books = new ArrayList<>();
}
