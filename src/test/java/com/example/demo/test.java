package com.example.demo;

import com.example.demo.entity.primary.Book;
import com.example.demo.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class test {

    @Autowired
    BookServiceImpl bookService;

    @Test
    public void test() {
        Book book = new Book();
        book.setTitle("adsa");
        book.setAuthor("author");
        book.setGenre("dwad");
        book.setTotalCopies(11);
        book.setAvailableCopies(1);
        bookService.insert(book);
        System.out.println(bookService.findAll());
    }
}
