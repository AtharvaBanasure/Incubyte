package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Library {
	private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                return true;
            }
        }
        return false;  // Book not available or not found
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(true);
                return;
            }
        }
    }

    public List<Book> viewAvailableBooks() {
        return books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
    }

    public List<Book> getBooks() {
        return books;
    }
}
