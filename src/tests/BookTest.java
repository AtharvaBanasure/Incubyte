package tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

	@Test
    public void testBookCreation() {
        Book book = new Book("12345", "Effective Java", "Joshua Bloch", 2018);
        assertEquals("12345", book.getIsbn());
        assertEquals("Effective Java", book.getTitle());
        assertEquals("Joshua Bloch", book.getAuthor());
        assertEquals(2018, book.getPublicationYear());
        assertTrue(book.isAvailable());
    }

    @Test
    public void testBookAvailability() {
        Book book = new Book("12345", "Clean Code", "Robert Martin", 2008);
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }
}
