package com.example.demo.mapper;

import com.example.demo.dto.AuthorDto;
import com.example.demo.entity.primary.AuthorEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AuthorMapper {
    @Autowired
    private ModelMapper mapper;

    public AuthorDto convertToDto(AuthorEntity authorEntity) {
        return mapper.map(authorEntity, AuthorDto.class);
    }

    public AuthorEntity convertToEntity(AuthorDto authorDto) {
        return mapper.map(authorDto, AuthorEntity.class);
    }
}

