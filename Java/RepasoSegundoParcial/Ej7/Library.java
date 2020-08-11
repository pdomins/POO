package ar.itba.edu.POO.RepasoSegundoParcial.Ej7;

import java.time.LocalDate;
import java.util.*;

public class Library {
    Map<String, BookInfo> bookMap = new HashMap<>();
    Map<Clients, Loan> loans = new HashMap<>();

    public Library addBook(String title, int stock){
        bookMap.put(title, new BookInfo(title,stock));
      return this;
    }

    public void borrowBook(Clients client, String bookTitle, LocalDate date) {
        if (!bookMap.containsKey(bookTitle)){
            throw new IllegalArgumentException("Book not found");
        }
        bookMap.get(bookTitle).borrowBook();
        loans.put(client, new Loan(client, bookTitle,date));
    }

    public void printDueLoansBooks(LocalDate date) {
        System.out.println("Due loans at "+ date.toString());
        Set<Clients> loanClients = loans.keySet();
        for (Clients client : loanClients){
            if (date.isAfter(loans.get(client).getDate().plusDays(loans.get(client).getClient().getLoanTime()))){
                System.out.println(client.getName()+" ("+loans.get(client).getBookTitle()+" - "+loans.get(client).getDate()+")");
            }
        }
        System.out.println();

    }

    public void returnBook(Clients client) {
        Loan returning = loans.remove(client);
        if (returning == null){
            throw new IllegalArgumentException();
        }
        bookMap.get(returning.getBookTitle()).returnBook();
    }
}
