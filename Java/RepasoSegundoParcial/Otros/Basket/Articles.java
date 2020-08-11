package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket;

import java.util.Objects;

public abstract class Articles implements Comparable<Articles> {
    String name;
    double price;

    public Articles(String name, double price) {
        this.name = name;
        this.price = price;
    }
    protected void setPrice(double amount){
        price = amount;
    }
    @Override
    public int compareTo(Articles articles) {
        return this.name.compareTo(articles.name);
    }

    public String getName() {
        return name;
    }

    public double getPrice(double amount){
        return amount*price;
    }
    public String stringBuild(double amount){
        StringBuilder aux = new StringBuilder(name).append(": ")
                .append(amount).append("* $").append(price).append(" = $").append(getPrice(amount));
        return aux.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articles)) return false;
        Articles articles = (Articles) o;
        return Objects.equals(name, articles.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
