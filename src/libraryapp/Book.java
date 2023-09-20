
package libraryapp;


public class Book {
    // Private fields to store book information.
    private String title;
    private String author;
    private String ISBN;

    /**
     * Constructs a new Book object with the specified title, author, and ISBN.
     *
     * @param title  The title of the book.
     * @param author The author of the book.
     * @param ISBN   The ISBN (International Standard Book Number) of the book.
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {  //gets title of the book
        return title;
    }

    public String getAuthor() {  //gets author of the book
        return author;
    }

    public String getISBN() {   //The ISBN (International Standard Book Number) of the book.
     
        return ISBN;
    }
}


