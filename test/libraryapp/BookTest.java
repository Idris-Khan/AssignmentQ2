/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package libraryapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    
    @Test
    public void testBookProperties() {
        // Create a book with specific properties
        Book book = new Book("GrandTheft Auto", "Bululu Bambas", "0123456789");

        // Check if the book properties match the expected values
        assertEquals("GrandTheft Auto", book.getTitle());
        assertEquals("Bululu Bambas", book.getAuthor());
        assertEquals("0123456789", book.getISBN());
    }
}



