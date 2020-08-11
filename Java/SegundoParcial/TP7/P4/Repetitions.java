package ar.itba.edu.POO.SegundoParcial.TP7.P4;

import java.util.Objects;


public class Repetitions implements Comparable<Repetitions> {
    Genre genre;
    Book book;
    int repetitions;

    public Repetitions(Book book) {
        this.book = book;
        this.repetitions = 1;
    }

    public Repetitions(Genre genre, Book book) {
        this.genre = genre;
        this.book = book;
    }

    public Repetitions(Genre genre, Book book, int repetitions) {
        this(genre,book);
        this.repetitions = repetitions;
    }

    public Genre getGenre() {
        return genre;
    }

    public Book getBook() {
        return book;
    }

    public int getRepetitions() {
        return repetitions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Repetitions)) return false;
        Repetitions that = (Repetitions) o;
        return genre == that.genre &&
                Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, book);
    }

    @Override
    public int compareTo(Repetitions repetitions) {
        int cmp = Integer.compare(repetitions.repetitions, this.repetitions);
        if (cmp == 0 ){
            cmp = this.book.compareTo(repetitions.book);
        }
        return cmp;
    }
}
