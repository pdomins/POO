package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket2_0;

public abstract class Articles{
    String name;
    double price;

    public Articles(String name, double price) {
        this.name = name;
        this.price = price;
    }
    protected void setPrice(double amount){
        price = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
