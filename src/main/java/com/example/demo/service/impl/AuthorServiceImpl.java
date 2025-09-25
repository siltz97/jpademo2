package com.example.demo.service.impl;

import com.example.demo.entity.primary.AuthorEntity;
import com.example.demo.repo.primary.AuthorRepository;
import com.example.demo.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorEntity> findAll() {
        return authorRepository.findAll() ;
    }

    @Override
    public AuthorEntity findByAuthorId(Integer id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public AuthorEntity insert(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }

    @Override
    public void update(AuthorEntity authorEntity) {
        authorRepository.findById(authorEntity.getId()).get();
        authorEntity.setFirstName("dwadwa");
        authorRepository.save(authorEntity);
    }

    @Override
    public void delete(AuthorEntity authorEntity) {
        authorRepository.delete(authorEntity);
    }

    @Override
    public AuthorEntity findYoungest() {
        return authorRepository.findTopByOrderByBirthDateDesc().get();
    }

    @Override
    public AuthorEntity findYoungest2() {
        return authorRepository.findFirstByOrderByBirthDateDesc().get();
    }

    @Override
    public List<AuthorEntity> findByLetter(String letter) {
        List<AuthorEntity> authors = authorRepository.findAllByFirstNameStartsWith(letter).stream()
                .map(a->a.get())
                .toList();
        return authors;
    }


}
