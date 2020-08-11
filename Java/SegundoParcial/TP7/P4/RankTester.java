package ar.itba.edu.POO.SegundoParcial.TP7.P4;


public class RankTester {
    public static void main(String[] args){
        Ranker ranker = new Ranker();

        Book hp7 = new Book("Harry Potter and the Deadly Shadows","JK Rowling");
        Book t2t = new Book("The Two Towers","JRR Tolkien");
        Book theHobbit = new Book("The Hobbit","JRR Tolkien");
        Book studyInScarlet = new Book("A Study in Scarlet","Arthur Conan Doyle");
        Book hamlet = new Book("Hamlet","William Shakespeare");
        Book prejudice = new Book("Pride and Prejudice", "Jane Austen");
        Book eragon = new Book("Eragon", "Christopher Paolini");

        ranker.add(Genre.FANTASY, hp7);
        ranker.add(Genre.FANTASY, theHobbit);
        ranker.add(Genre.FANTASY, t2t);
        ranker.add(Genre.FICTION, studyInScarlet);
        ranker.add(Genre.DRAMA, hamlet);
        ranker.add(Genre.DRAMA, prejudice);

        ranker.rateUp(hp7);
        ranker.rateUp(hp7);
        ranker.rateUp(hp7);
        ranker.rateUp(theHobbit);
        ranker.rateUp(theHobbit);
        ranker.rateUp(hamlet);
        ranker.rateUp(new Book("Eragon","Christopher Paolini"));
        ranker.rateUp(eragon);

        ranker.printRanker(Genre.FANTASY);
        System.out.println("-----------------------------");
        ranker.printRanker(Genre.DRAMA);
        System.out.println("-----------------------------");
        ranker.printRanker(Genre.CHILDREN);
        System.out.println("-----------------------------");
        ranker.printRanker();

    }
}
