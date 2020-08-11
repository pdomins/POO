package ar.itba.edu.POO.SegundoParcial.TP7.P4;

import java.util.Objects;

public class Book implements Comparable<Book> {
    String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public int compareTo(Book book) {
        return this.title.compareTo(book.title) +
                this.author.compareTo(book.author);
    }
}
