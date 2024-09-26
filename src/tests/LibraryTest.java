package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class LibraryTest {

	private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void setUp() {
        library = new Library();
        book1 = new Book("12345", "Effective Java", "Joshua Bloch", 2018);
        book2 = new Book("67890", "Clean Code", "Robert Martin", 2008);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void testAddBook() {
        assertEquals(2, library.getBooks().size());
        assertEquals("Effective Java", library.getBooks().get(0).getTitle());
    }

    @Test
    public void testBorrowBook() {
        boolean borrowed = library.borrowBook("12345");
        assertTrue(borrowed);
        assertFalse(book1.isAvailable());
    }

    @Test
    public void testBorrowUnavailableBook() {
        library.borrowBook("12345");  // Borrowing the book
        boolean borrowedAgain = library.borrowBook("12345");
        assertFalse(borrowedAgain);
    }

    @Test
    public void testReturnBook() {
        library.borrowBook("12345");
        library.returnBook("12345");
        assertTrue(book1.isAvailable());
    }

    @Test
    public void testViewAvailableBooks() {
        library.borrowBook("12345");
        assertEquals(1, library.viewAvailableBooks().size());
        assertEquals("Clean Code", library.viewAvailableBooks().get(0).getTitle());
    }
}
