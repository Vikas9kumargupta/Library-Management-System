package com.example.lms.services;

import com.example.lms.entities.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAllAuthors();
    Author findById(Long authorId);
    void createAuthor(Author author);
    void removeAuthor(Long authorId);
    void updateAuthor(Author author);

}
