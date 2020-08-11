package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket;

import java.util.*;

public class Basket {

    String consumer;
    Map<Articles,Double> myBasket = new HashMap<>();
    double totalPrice;

    public Basket(String consumer) {
        this.consumer = consumer;
    }
    public Basket add(Articles article,double amount){
        myBasket.putIfAbsent(article,amount);
        return this;
    }
    public Basket add(Articles article){
        return add(article,1);
    }

    public double getCost() {
        return totalPrice;
    }


    @Override
    public String toString() {
        totalPrice=0;
        StringBuilder basket = new StringBuilder(consumer).append(" ").append(System.getProperty("line.separator"));
        Set<Articles> mySet = myBasket.keySet();
        for (Articles article: mySet){
            double amount = myBasket.get(article);
            basket.append(article.stringBuild(amount)).append(System.getProperty("line.separator"));
            totalPrice+=article.getPrice(amount);
        }
        return basket.toString();
    }
}
