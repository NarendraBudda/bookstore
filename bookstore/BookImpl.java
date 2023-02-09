package com.bookstore;

public class BookImpl {
    public static void main(String args[]) {
        Book book = new Book();
        Author author = new Author("Gilad Bracha", "Bracha Pen");
        book.setISBNNumber(325);
        book.setTitle("Java Programming");
        book.setDescription("Java Programming is high level language.We can create Application and Web pages etc..");
        book.setPrice(250);
        book.setAuthor(author);
        book.displaydetails();
    }
}
