package com.example.demo.controller;

import com.example.demo.dto.AuthorDto;
import com.example.demo.entity.primary.AuthorEntity;
import com.example.demo.mapper.AuthorMapper;
import com.example.demo.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController()
public class AuthorController {

    @Autowired
    private AuthorServiceImpl authorService;

    @Autowired
    private AuthorMapper authorMapper;

    @PostMapping
    public ResponseEntity<AuthorDto> insert(@RequestBody AuthorDto author) {
       AuthorEntity authorEntity = authorMapper.convertToEntity(author);
       authorService.insert(authorEntity);
       author = authorMapper.convertToDto(authorEntity);
        return ResponseEntity.ok(author);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AuthorDto>> findAll() {
        List<AuthorEntity> authorEntities = authorService.findAll();
        List<AuthorDto> authorDtos = authorEntities.stream().map(authorEntity -> authorMapper.convertToDto(authorEntity)).toList();
        return ResponseEntity.ok(authorDtos);
    }

    @GetMapping("/top")
    public ResponseEntity<AuthorDto> findTop() {
        AuthorEntity authorEntity = authorService.findYoungest();
        AuthorDto authorDto = authorMapper.convertToDto(authorEntity);
        return ResponseEntity.ok(authorDto);
    }

    @GetMapping("/first")
    public ResponseEntity<AuthorDto> findFirst() {
        AuthorEntity authorEntity = authorService.findYoungest2();
        AuthorDto authorDto = authorMapper.convertToDto(authorEntity);
        return ResponseEntity.ok(authorDto);
    }
}
