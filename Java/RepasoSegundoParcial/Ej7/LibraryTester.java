package ar.itba.edu.POO.RepasoSegundoParcial.Ej7;

import java.time.LocalDate;

public class LibraryTester {
    public static void main(String[] args){
        System.out.println(LocalDate.of(2018,12,3).isAfter(LocalDate.of(2018,12,1)));

        Library library =  new Library().addBook("Book 1",1)
                .addBook("Book 2",1)
                .addBook("Book 3",3);
        Clients s1 = new Clients("Student 1", loanType.STUDENT);
        library.borrowBook(s1,"Book 1", LocalDate.of(2018,12,1));

        Clients s2 = new Clients("Student 2", loanType.STUDENT);
        library.borrowBook(s2,"Book 3", LocalDate.of(2018,12,1));

        Clients s3 = new Clients("Student 3", loanType.STUDENT);
        library.borrowBook(s3,"Book 3", LocalDate.of(2018,12,2));

        library.printDueLoansBooks(LocalDate.of(2018,12,4));
        library.returnBook(s1);
        library.returnBook(s2);
        library.returnBook(s3);

        Clients p1 = new Clients("Professor 1", loanType.RESPONSIBLE);
        library.borrowBook(p1, "Book 1", LocalDate.of(2018,12,4));


        Clients p2 = new Clients("Professor 2", loanType.PRACTICAL);
        library.borrowBook(p2, "Book 3", LocalDate.of(2018,12,4));

        Clients p3 = new Clients("Professor 3", loanType.ASSISTANT);
        library.borrowBook(p3, "Book 3", LocalDate.of(2018,12,4));

        library.printDueLoansBooks(LocalDate.of(2018,12,10));
        library.printDueLoansBooks(LocalDate.of(2018,12,15));
        library.printDueLoansBooks(LocalDate.of(2018,12,16));
        library.printDueLoansBooks(LocalDate.of(2018,12,17));

        try {
            library.borrowBook(s1, "Other Book", LocalDate.of(2018,12,3));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
