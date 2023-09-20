/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;




import java.util.ArrayList;
import java.util.List;

public class Library {
  
    private List<Book> books;
    private int capacity;

    /**
     * Constructs a new Library object with the specified capacity.
     * @param capacity The maximum number of books that the library can hold.
     */
    public Library(int capacity) {
        
        this.books = new ArrayList<>(capacity);
        // Adjusting the library capacity...
        this.capacity = capacity;
    }

    
    public void addBook(Book book) {
        if (books.size() < capacity) {
             // Print a success message and add the book to the list if there is room.

            books.add(book);
            System.out.println("You Have Successfully added a book!");
        } else {
            // Print a message stating that no more books may be added if the library is full.

            System.out.println("Library is full. Cannot add more books.");
        }
    }

   
    public Book searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getISBN().contains(keyword)) {
                // If a matched book is discovered, give it back.

                return book;
            }
        }
        // Return null if no matching books are found.

        return null;
    }


    public void listBooks() {
        if (books.isEmpty()) {
            
            System.out.println("NO Books in library currently.");
        } else {
            
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println();
                System.out.println("  Thank you<>  ");
            }
        }
    }
}

