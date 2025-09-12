package com.example.demo.service.impl;

import com.example.demo.entity.primary.Book;
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
    public Book findByBookId(Integer id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Book> findAll() {
        return  bookRepository.findAll();
    }

    @Override
    public Book insert(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void update(Book book) {
        findByBookId(book.getId());
        book.setTitle("");
        bookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
