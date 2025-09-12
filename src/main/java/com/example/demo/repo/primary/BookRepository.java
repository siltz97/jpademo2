package com.example.demo.repo.primary;

import com.example.demo.entity.primary.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {

}
