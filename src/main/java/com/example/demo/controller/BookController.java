package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/books")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books;
        books = bookService.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id) {
        return ResponseEntity.ok(bookService.findByBookId(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        bookService.update(book);
        return ResponseEntity.ok(book);
    }

    @PostMapping("/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        bookService.insert(book);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteBook(@RequestBody Book book) {
        bookService.delete(book.getId());
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
