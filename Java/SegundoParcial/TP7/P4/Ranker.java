package ar.itba.edu.POO.SegundoParcial.TP7.P4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranker {
    Set<Repetitions> myRank = new TreeSet<>();

    public void add(Genre genre, Book book) {
        myRank.add(new Repetitions(genre, book));
    }

    public void rateUp(Book book) {
        Iterator<Repetitions> myIt= myRank.iterator();
        boolean match = false;
        Repetitions aux;
       while (myIt.hasNext() && !match){
           aux = myIt.next();
           if (aux.getBook().equals(book)){
               match = true;
               myIt.remove();
               myRank.add(new Repetitions(aux.getGenre(),aux.getBook(), aux.getRepetitions()+1));
           }
       }
       if (!match){
           myRank.add(new Repetitions(book));
       }
       
    }

    public void printRanker(Genre genre) {
        System.out.println("Ranking of "+ genre.getGenreName());
        for (Repetitions aux: myRank){
           if (aux.getGenre() != null && aux.getGenre().compareTo(genre) == 0){
                System.out.println(aux.getBook().getTitle()+": "+aux.getRepetitions());
           }
        }
    }

    public void printRanker() {
        System.out.println("General Ranking");
        for (Repetitions aux: myRank){
            System.out.println(aux.getBook().getTitle()+ ": " + aux.getRepetitions());
        }
    }
}
