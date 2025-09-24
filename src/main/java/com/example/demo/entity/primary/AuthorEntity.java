package com.example.demo.entity.primary;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(schema="dbo",name="library_authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;

    @Column(name="name")
    private String firstName;

    @Column(name="surname")
    private String lastName;

    @Column(name="birth_date")
    private Date birthDate;

    @OneToMany(mappedBy = "autore", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<BookEntity> libri = new ArrayList<>();
}
