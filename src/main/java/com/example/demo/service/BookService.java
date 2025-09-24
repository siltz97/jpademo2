package com.example.demo.service;

import com.example.demo.entity.primary.BookEntity;

import java.util.List;


public interface BookService {
    BookEntity findByBookId(Integer id);

    List<BookEntity> findAll();

    BookEntity insert(BookEntity bookEntity);

    void update(BookEntity bookEntity);

    void delete(Integer id);
}
