package com.example.demo.service.impl;

import com.example.demo.entity.primary.AuthorEntity;
import com.example.demo.repo.primary.AuthorRepository;
import com.example.demo.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

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
        return authorRepository.findTopByBirthDateOrderByBirthDateDesc();
    }

    @Override
    public AuthorEntity findYoungest2() {
        return authorRepository.findFirstByBirthDateOrderByBirthDateDesc();
    }


}
