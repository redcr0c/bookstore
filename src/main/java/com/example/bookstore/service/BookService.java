package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    
    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    // Get book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    
    // Create a new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    
    // Update an existing book
    public Book updateBook(Long id, Book bookDetails) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setPublicationYear(bookDetails.getPublicationYear());

            return bookRepository.save(book);
        }
        return null;
    }
    
    // Delete a book
    public boolean deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
    // Search books by author
    public List<Book> searchByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
    
    // Search books by title
    public List<Book> searchByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    // Get books by publication year
    public List<Book> getBooksByPublicationYear(Integer year) {
        return bookRepository.findByPublicationYear(year);
    }
}