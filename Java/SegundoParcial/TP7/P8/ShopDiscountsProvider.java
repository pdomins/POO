package ar.itba.edu.POO.SegundoParcial.TP7.P8;

import java.util.HashMap;
import java.util.Map;

public class ShopDiscountsProvider {
    Map<String, Double> discountShop = new HashMap<>();

    public void addShop(String name, double discount) {
        discountShop.put(name,discount);
    }

    public Double getDiscount(String name){
        return discountShop.get(name);
    }
    public boolean hasDiscount(String name){
        return discountShop.containsKey(name);
    }
}
