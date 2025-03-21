package com.example.lms.repositories;

import com.example.lms.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByName(String name);
}
