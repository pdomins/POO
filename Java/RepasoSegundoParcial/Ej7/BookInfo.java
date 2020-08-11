package ar.itba.edu.POO.RepasoSegundoParcial.Ej7;

public class BookInfo {
    private String name;
    private int stock;

    public BookInfo(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void borrowBook(){
        if (stock==0)
            throw new IllegalArgumentException();
        stock--;
    }
    public void returnBook(){
        stock++;
    }

}
