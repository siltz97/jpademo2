package com.example.demo.service;

import com.example.demo.entity.primary.Book;

import java.util.List;


public interface BookService {
    Book findByBookId(Integer id);

    List<Book> findAll();

    Book insert(Book book);

    void update(Book book);

    void delete(Integer id);
}
