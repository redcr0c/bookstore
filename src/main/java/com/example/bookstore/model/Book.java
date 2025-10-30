package com.example.bookstore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private String author;
    
    private Integer publicationYear;
    
    // Default constructor
    public Book() {}

    // Parameterized constructor
    public Book(String title, String author, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    
    // Getters and setters
    public Long getId() { 
        return id; 
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public String getTitle() { 
        return title; 
    }
    
    public void setTitle(String title) { 
        this.title = title; 
    }
    
    public String getAuthor() { 
        return author; 
    }
    
    public void setAuthor(String author) { 
        this.author = author; 
    }
    
    public Integer getPublicationYear() { 
        return publicationYear; 
    }
    
    public void setPublicationYear(Integer publicationYear) { 
        this.publicationYear = publicationYear; 
    }
}