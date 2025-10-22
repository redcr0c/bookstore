package com.example.bookstore.config;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    
    @Autowired
    private BookRepository bookRepository;
    
    @Override
    public void run(String... args) throws Exception {
        // Add the top 100 most popular books
        bookRepository.save(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        bookRepository.save(new Book("1984", "George Orwell", 1949));
        bookRepository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookRepository.save(new Book("Pride and Prejudice", "Jane Austen", 1813));
        bookRepository.save(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        bookRepository.save(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        bookRepository.save(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        bookRepository.save(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        bookRepository.save(new Book("Animal Farm", "George Orwell", 1945));
        bookRepository.save(new Book("The Chronicles of Narnia", "C.S. Lewis", 1950));
        bookRepository.save(new Book("Brave New World", "Aldous Huxley", 1932));
        bookRepository.save(new Book("The Da Vinci Code", "Dan Brown", 2003));
        bookRepository.save(new Book("The Alchemist", "Paulo Coelho", 1988));
        bookRepository.save(new Book("The Hunger Games", "Suzanne Collins", 2008));
        bookRepository.save(new Book("The Kite Runner", "Khaled Hosseini", 2003));
        bookRepository.save(new Book("Lord of the Flies", "William Golding", 1954));
        bookRepository.save(new Book("Jane Eyre", "Charlotte Brontë", 1847));
        bookRepository.save(new Book("Gone with the Wind", "Margaret Mitchell", 1936));
        bookRepository.save(new Book("The Book Thief", "Markus Zusak", 2005));
        bookRepository.save(new Book("Wuthering Heights", "Emily Brontë", 1847));
        bookRepository.save(new Book("The Handmaid's Tale", "Margaret Atwood", 1985));
        bookRepository.save(new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943));
        bookRepository.save(new Book("The Grapes of Wrath", "John Steinbeck", 1939));
        bookRepository.save(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
        bookRepository.save(new Book("Moby-Dick", "Herman Melville", 1851));
        bookRepository.save(new Book("War and Peace", "Leo Tolstoy", 1869));
        bookRepository.save(new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866));
        bookRepository.save(new Book("The Odyssey", "Homer", -800));
        bookRepository.save(new Book("The Bible", "Various", -1400));
        bookRepository.save(new Book("The Quran", "Various", -600));
        bookRepository.save(new Book("Don Quixote", "Miguel de Cervantes", 1605));
        bookRepository.save(new Book("The Brothers Karamazov", "Fyodor Dostoevsky", 1880));
        bookRepository.save(new Book("Anna Karenina", "Leo Tolstoy", 1877));
        bookRepository.save(new Book("Catch-22", "Joseph Heller", 1961));
        bookRepository.save(new Book("The Shining", "Stephen King", 1977));
        bookRepository.save(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 1967));
        bookRepository.save(new Book("The Picture of Dorian Gray", "Oscar Wilde", 1890));
        bookRepository.save(new Book("The Count of Monte Cristo", "Alexandre Dumas", 1844));
        bookRepository.save(new Book("Great Expectations", "Charles Dickens", 1861));
        bookRepository.save(new Book("The Scarlet Letter", "Nathaniel Hawthorne", 1850));
        bookRepository.save(new Book("Frankenstein", "Mary Shelley", 1818));
        bookRepository.save(new Book("Dracula", "Bram Stoker", 1897));
        bookRepository.save(new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1884));
        bookRepository.save(new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 1865));
        bookRepository.save(new Book("The Divine Comedy", "Dante Alighieri", 1320));
        bookRepository.save(new Book("Ulysses", "James Joyce", 1922));
        bookRepository.save(new Book("Lolita", "Vladimir Nabokov", 1955));
        bookRepository.save(new Book("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        bookRepository.save(new Book("The Bell Jar", "Sylvia Plath", 1963));
        bookRepository.save(new Book("In Cold Blood", "Truman Capote", 1966));
        bookRepository.save(new Book("A Tale of Two Cities", "Charles Dickens", 1859));
        bookRepository.save(new Book("Heart of Darkness", "Joseph Conrad", 1899));
        bookRepository.save(new Book("Les Misérables", "Victor Hugo", 1862));
        bookRepository.save(new Book("The Stranger", "Albert Camus", 1942));
        bookRepository.save(new Book("The Old Man and the Sea", "Ernest Hemingway", 1952));
        bookRepository.save(new Book("The Sun Also Rises", "Ernest Hemingway", 1926));
        bookRepository.save(new Book("For Whom the Bell Tolls", "Ernest Hemingway", 1940));
        bookRepository.save(new Book("The Road", "Cormac McCarthy", 2006));
        bookRepository.save(new Book("No Country for Old Men", "Cormac McCarthy", 2005));
        bookRepository.save(new Book("The Stand", "Stephen King", 1978));
        bookRepository.save(new Book("It", "Stephen King", 1986));
        bookRepository.save(new Book("The Name of the Rose", "Umberto Eco", 1980));
        bookRepository.save(new Book("Life of Pi", "Yann Martel", 2001));
        bookRepository.save(new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 2005));
        bookRepository.save(new Book("The Help", "Kathryn Stockett", 2009));
        bookRepository.save(new Book("Water for Elephants", "Sara Gruen", 2006));
        bookRepository.save(new Book("The Time Traveler's Wife", "Audrey Niffenegger", 2003));
        bookRepository.save(new Book("Twilight", "Stephenie Meyer", 2005));
        bookRepository.save(new Book("The Secret History", "Donna Tartt", 1992));
        bookRepository.save(new Book("American Gods", "Neil Gaiman", 2001));
        bookRepository.save(new Book("The Goldfinch", "Donna Tartt", 2013));
        bookRepository.save(new Book("All the Light We Cannot See", "Anthony Doerr", 2014));
        bookRepository.save(new Book("The Night Circus", "Erin Morgenstern", 2011));
        bookRepository.save(new Book("Where the Crawdads Sing", "Delia Owens", 2018));
        bookRepository.save(new Book("Educated", "Tara Westover", 2018));
        bookRepository.save(new Book("The Silent Patient", "Alex Michaelides", 2019));
        bookRepository.save(new Book("Circe", "Madeline Miller", 2018));
        bookRepository.save(new Book("The Seven Husbands of Evelyn Hugo", "Taylor Jenkins Reid", 2017));
        bookRepository.save(new Book("Project Hail Mary", "Andy Weir", 2021));
        bookRepository.save(new Book("Dune", "Frank Herbert", 1965));
        bookRepository.save(new Book("Foundation", "Isaac Asimov", 1951));
        bookRepository.save(new Book("Ender's Game", "Orson Scott Card", 1985));
        bookRepository.save(new Book("The Martian", "Andy Weir", 2011));
        bookRepository.save(new Book("Ready Player One", "Ernest Cline", 2011));
        bookRepository.save(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979));
        bookRepository.save(new Book("A Game of Thrones", "George R.R. Martin", 1996));
        bookRepository.save(new Book("The Pillars of the Earth", "Ken Follett", 1989));
        bookRepository.save(new Book("Outlander", "Diana Gabaldon", 1991));
        bookRepository.save(new Book("The Shadow of the Wind", "Carlos Ruiz Zafón", 2001));
        bookRepository.save(new Book("The Secret Garden", "Frances Hodgson Burnett", 1911));
        bookRepository.save(new Book("Little Women", "Louisa May Alcott", 1868));
        bookRepository.save(new Book("Anne of Green Gables", "L.M. Montgomery", 1908));
        bookRepository.save(new Book("Rebecca", "Daphne du Maurier", 1938));
        bookRepository.save(new Book("And Then There Were None", "Agatha Christie", 1939));
        bookRepository.save(new Book("Murder on the Orient Express", "Agatha Christie", 1934));
        bookRepository.save(new Book("The Hound of the Baskervilles", "Arthur Conan Doyle", 1902));
        bookRepository.save(new Book("Sherlock Holmes", "Arthur Conan Doyle", 1887));
        bookRepository.save(new Book("The Three Musketeers", "Alexandre Dumas", 1844));
        bookRepository.save(new Book("Treasure Island", "Robert Louis Stevenson", 1883));
        bookRepository.save(new Book("The Call of the Wild", "Jack London", 1903));
        bookRepository.save(new Book("White Fang", "Jack London", 1906));
        bookRepository.save(new Book("Peter Pan", "J.M. Barrie", 1911));
        bookRepository.save(new Book("The Wonderful Wizard of Oz", "L. Frank Baum", 1900));
        bookRepository.save(new Book("A Wrinkle in Time", "Madeleine L'Engle", 1962));
        bookRepository.save(new Book("The Giver", "Lois Lowry", 1993));
        bookRepository.save(new Book("Charlotte's Web", "E.B. White", 1952));
        
        System.out.println("Sample data initialized!");
    }
}
