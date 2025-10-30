package com.example.bookstore.config;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/books.json");
            List<Book> books = objectMapper.readValue(inputStream, new TypeReference<List<Book>>() {});
            
            bookRepository.saveAll(books);
            System.out.println("Loaded " + books.size() + " books from JSON file.");
        } catch (Exception e) {
            System.err.println("Error loading books from JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}