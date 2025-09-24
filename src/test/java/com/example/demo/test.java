package com.example.demo;

import com.example.demo.entity.primary.BookEntity;
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
        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle("adsa");
        bookEntity.setGenre("dwad");
        bookService.insert(bookEntity);
        System.out.println(bookService.findAll());
    }
}
