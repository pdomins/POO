package ar.itba.edu.POO.RepasoSegundoParcial.Ej7;

import java.time.LocalDate;

public class Loan {
    Clients client;
    String bookTitle;
    LocalDate date;

    public Loan(Clients client, String bookTitle, LocalDate date) {
        this.client = client;
        this.bookTitle = bookTitle;
        this.date = date;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public LocalDate getDate() {
        return date;
    }

    public Clients getClient() {
        return client;
    }
}
