package ObjectOrientedDesignProblem.ObjectDesign;

import java.util.ArrayList;


class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}


class Library {
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add books
    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("\nLibrary Name: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
    }
}


public class Librarybooks {
    public static void main(String[] args) {

        // Creating Book objects (independent)
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Data Structures", "Mark Allen Weiss");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Creating Library objects
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        // Display libraries
        lib1.showBooks();
        lib2.showBooks();
    }
}
