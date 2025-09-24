package com.example.demo.controller;

import com.example.demo.entity.primary.BookEntity;
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
    public ResponseEntity<List<BookEntity>> getBooks() {
        List<BookEntity> bookEntities;
        bookEntities = bookService.findAll();
        return ResponseEntity.ok(bookEntities);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookEntity> getBook(@PathVariable Integer id) {
        return ResponseEntity.ok(bookService.findByBookId(id));
    }

    @PutMapping("/update")
    public ResponseEntity<BookEntity> updateBook(@RequestBody BookEntity bookEntity) {
        bookService.update(bookEntity);
        return ResponseEntity.ok(bookEntity);
    }

    @PostMapping("/create")
    public ResponseEntity<BookEntity> createBook(@RequestBody BookEntity bookEntity) {
        bookService.insert(bookEntity);
        return ResponseEntity.ok(bookEntity);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteBook(@RequestBody BookEntity bookEntity) {
        bookService.delete(bookEntity.getId());
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
