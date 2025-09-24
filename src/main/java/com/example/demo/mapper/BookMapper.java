package com.example.demo.mapper;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.primary.BookEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMapper{

    @Autowired
    private ModelMapper mapper;

    public BookDto convertToDto(BookEntity bookEntity) {
        return mapper.map(bookEntity, BookDto.class);
    }

    public BookEntity convertToEntity(BookDto bookDto) {
        return mapper.map(bookDto, BookEntity.class);
    }
}
