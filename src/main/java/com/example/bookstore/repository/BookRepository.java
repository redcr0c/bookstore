package com.example.bookstore.repository;

import com.example.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    // Custom query method to find books by author
    List<Book> findByAuthor(String author);
    
    // Custom query method to find books by title
    List<Book> findByTitle(String title);
    
    // Custom query method to find books by publication year
    List<Book> findByPublicationYear(Integer year);
}