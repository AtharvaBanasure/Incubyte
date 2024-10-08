# Library Management System

This is a *Library Management System* built in **Java**, following **Test-Driven Development (TDD)** principles.

It allows users to add books, borrow them, return them, and view available books. The code adheres to *clean coding practices* and *object-oriented programming (OOP)* principles.

## Features

- *Add Books*: Users can add new books with a unique identifier (ISBN), title, author, and publication year.
- *Borrow Books*: Books can be borrowed if available. The system ensures availability before lending.
- *Return Books*: Borrowed books can be returned, updating their availability status.
- *View Available Books*: A list of available books can be viewed.

## Project Structure

### Book Class
Represents a book with attributes such as:
- ISBN
- Title
- Author
- Publication Year
- Availability Status

### Library Class
Manages the collection of books and operations like:
- Adding books
- Borrowing books
- Returning books
- Viewing available books

## Requirements

- *Java*: Make sure Java 11 or higher is installed.
- *JUnit*: The project uses JUnit for unit testing. If you’re using Maven or Gradle, the dependencies are already set up.

## Class Diagram
![Screenshot 2024-09-27 025722](https://github.com/user-attachments/assets/83c71448-7396-4fe5-80f1-ce28fef4e1e6)


## Methods

### 1. Library Class

- addBook(Book book): Adds a book to the library.
- borrowBook(String isbn): Allows a user to borrow a book if it's available.
- returnBook(String isbn): Allows a user to return a borrowed book.
- viewAvailableBooks(): Returns a list of all available books.

### 2. Book Class

- *Attributes*:
  - ISBN
  - Title
  - Author
  - Publication Year
  - Availability

- *Methods*:
  - Getters for each attribute (e.g., getIsbn()).
  - setAvailable(boolean available): Updates the availability status of the book.

