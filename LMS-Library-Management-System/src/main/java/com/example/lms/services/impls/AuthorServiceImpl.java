package com.example.lms.services.impls;

import com.example.lms.entities.Author;
import com.example.lms.exceptions.ResourceNotFoundException;
import com.example.lms.repositories.AuthorRepository;
import com.example.lms.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(Long authorId) {
        return authorRepository.findById(authorId).orElseThrow(()-> new RuntimeException("\"Author not Found with id "+authorId));
    }

    @Override
    public void createAuthor(Author author) {
        authorRepository.save(author);

    }

    @Override
    public void removeAuthor(Long authorId) {
        Author author = authorRepository.findById(authorId).orElseThrow(() -> new ResourceNotFoundException("Author not Found with id "+authorId));
        authorRepository.deleteById(author.getId());
    }

    @Override
    public void updateAuthor(Author author) {
        authorRepository.save(author);
    }
}
