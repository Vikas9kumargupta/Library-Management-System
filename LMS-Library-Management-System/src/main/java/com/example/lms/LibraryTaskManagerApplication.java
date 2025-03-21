package com.example.lms;

import com.example.lms.entities.Author;
import com.example.lms.entities.Book;
import com.example.lms.entities.Category;
import com.example.lms.entities.Publisher;
import com.example.lms.services.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryTaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryTaskManagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService){
		return (args) -> {
			Book book1 = new Book("ABC", "Book Name 1", "My First Book");
			Author author1 = new Author("Test Name 1", "Test Description");
			Category category1 = new Category("Business Books");
			Publisher publisher1 = new Publisher("First Publisher");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("DEF", "Book Name 2", "My Second Book");
			Author author2 = new Author("Test Name 2", "Test Description");
			Category category2 = new Category("Science Books");
			Publisher publisher2 = new Publisher("Second Publisher");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);

			Book book3 = new Book("GHI", "Book Name 3", "My Third Book");
			Author author3 = new Author("Test Name 3", "Test Description");
			Category category3 = new Category("Fiction Books");
			Publisher publisher3 = new Publisher("Third Publisher");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.createBook(book3);
		};
	}

}
