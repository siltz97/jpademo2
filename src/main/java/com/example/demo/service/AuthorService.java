package com.example.demo.service;

import com.example.demo.entity.primary.AuthorEntity;

import java.util.List;

public interface AuthorService  {
    List<AuthorEntity> findAll();
    AuthorEntity findByAuthorId(Integer id);
    AuthorEntity insert(AuthorEntity authorEntity);
    void update(AuthorEntity authorEntity);
    void delete(AuthorEntity authorEntity);
    AuthorEntity findYoungest();
    AuthorEntity findYoungest2();
    List<AuthorEntity> findByLetter(String letter);

}
