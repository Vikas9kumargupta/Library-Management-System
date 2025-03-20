package com.example.lms.services;

import com.example.lms.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    Book findById(Long bookId);
    void createBook(Book book);
    void deleteBook(Long bookId);
    void updateBook(Book book);

}
