package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket2_0;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    String client;
    List<BasketElements> myBasket = new ArrayList<>();
    double finalPrice;

    public Basket(String name) {
        this.client= name;
    }
    public Basket add(Articles product,int unit){
        myBasket.add(new BasketPerUnit(product, unit));
        return this;
    }
    public Basket add(Articles product,double amount){
        myBasket.add(new BasketPerWeight(product,amount));
        return this;
    }
    public Basket add(Articles service){
        myBasket.add(new BasketService(service));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(client + "\n");
        for (BasketElements element: myBasket){
            string.append(element.makeString()).append("\n");
            finalPrice+=element.getPrice();
        }
        return string.toString();
    }

    public double getCost() {
        return finalPrice;
    }
}
