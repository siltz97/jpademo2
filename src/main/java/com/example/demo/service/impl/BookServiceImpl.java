package com.example.demo.service.impl;

import com.example.demo.entity.primary.BookEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.repo.primary.BookRepository;
import com.example.demo.service.BookService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    @Override
    public BookEntity findByBookId(Integer id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<BookEntity> findAll() {
        return  bookRepository.findAll();
    }

    @Override
    public BookEntity insert(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    @Override
    public void update(BookEntity bookEntity) {
        findByBookId(bookEntity.getId());
        bookEntity.setTitle("");
        bookRepository.save(bookEntity);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
