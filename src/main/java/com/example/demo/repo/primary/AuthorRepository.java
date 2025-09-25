package com.example.demo.repo.primary;

import com.example.demo.entity.primary.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {
    Optional<AuthorEntity> findFirstByOrderByBirthDateDesc();

    Optional<AuthorEntity> findTopByOrderByBirthDateDesc();

    List<Optional<AuthorEntity>> findAllByFirstNameStartsWith(String letter);

}
