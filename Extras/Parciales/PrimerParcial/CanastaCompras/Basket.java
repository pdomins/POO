package ar.itba.edu.Parciales.PrimerParcial.CanastaCompras;

import java.util.Arrays;

public class Basket {
    Articles[] article;
    Double[] amounts;
    int dim;
    private final int INITIAL_DIM = 5;
    String client;
    double finalPrice;

    public Basket(String client) {
        this.client = client;
        article = new Articles[INITIAL_DIM];
        amounts = new Double[INITIAL_DIM];
    }
    public Basket add(Articles art, double amount){
        if (article.length == dim )
            resize();
        article[dim]=art;
        amounts[dim++]=amount;
        return this;
    }
    public Basket add(Articles art){
        this.add(art,1);
        return this;
    }


    private void resize() {
        article = Arrays.copyOf(article, article.length+INITIAL_DIM);
        amounts = Arrays.copyOf(amounts, amounts.length+INITIAL_DIM);
    }
    public String toString(){
        StringBuilder aux = new StringBuilder(client);
        aux.append(System.getProperty("line.separator"));
        for (int i = 0; i < dim ; i++){
            double price = article[i].getPrice(), aux1 = amounts[i]*price;
            aux.append(article[i].getName()).append(": ");
            aux.append(amounts[i]).append(" * ").append(price);
            aux.append(" $").append(aux1);
            aux.append(System.getProperty("line.separator"));
            finalPrice+=aux1;
        }
        return aux.toString();
    }
    public double getCost(){
        return finalPrice;
    }


}
