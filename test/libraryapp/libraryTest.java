/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package libraryapp;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class libraryTest {
    private Library library;

    /**
     *
     */
    @Before
    public void setUp() {
        // Create a library with a capacity of 2 and add two initial books.
        library = new Library(2);
        library.addBook(new Book("Book1", "Author1", "ISBN1"));
        library.addBook(new Book("Book2", "Author2", "ISBN2"));
    }

    @Test
    public void testAddBook() {
        // Test adding a book when the library is not full
        Book newBook = new Book("Book3", "Author3", "ISBN3");
        library.addBook(newBook);
        assertEquals(newBook, library.searchBook("Book3"));
        
        // Test adding a book when the library is full
        Book bookToOverflow = new Book("Book4", "Author4", "ISBN4");
        library.addBook(bookToOverflow);
        assertNull(library.searchBook("Book4")); // Book4 should not be added
    }

    @Test
    public void testSearchBook() {
        // Test searching for an existing book
        Book foundBook = library.searchBook("Tree Trunk");
        assertNotNull(foundBook);
        assertEquals("Tree Trunk", foundBook.getTitle());

        // Test searching for a non-existing book
        Book notFoundBook = library.searchBook("BookNonExistent");
        assertNull(notFoundBook);
    }
    
   @Test
    public void testSearchBookNotFound() {
        // Test searching for a book that does not exist in the library
        Book book = new Book("Grand Theft Auto", "Bululu Bambas", "0123456789");
        library.addBook(book);

        Book foundBook = library.searchBook("ggggg");
        assertNull(foundBook);
    }
    
    @Test
    public void testListBooks() {
        // You can add test cases for the listBooks method here if needed.
    }
}


