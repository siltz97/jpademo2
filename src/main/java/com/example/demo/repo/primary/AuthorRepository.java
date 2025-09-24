package com.example.demo.repo.primary;

import com.example.demo.entity.primary.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {
    AuthorEntity findFirstByBirthDateOrderByBirthDateDesc();

    AuthorEntity findTopByBirthDateOrderByBirthDateDesc();

}
