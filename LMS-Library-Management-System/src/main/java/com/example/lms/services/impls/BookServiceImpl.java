package com.example.lms.services.impls;

import com.example.lms.entities.Book;
import com.example.lms.exceptions.ResourceNotFoundException;
import com.example.lms.repositories.BookRepository;
import com.example.lms.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long bookId) {
        Book book;
        book = bookRepository.findById(bookId).orElseThrow(
                ()-> new ResourceNotFoundException("Book not found with id "+bookId));
        return book;
    }

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new ResourceNotFoundException("Book not found with id "+bookId));
        bookRepository.deleteById(book.getId());
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
