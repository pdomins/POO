package ar.itba.edu.POO.RepasoSegundoParcial.Otros.Basket;

public class Service extends Articles {

    public Service(String name, double price) {
        super(name, price);
    }
    public String stringBuild(double amount){
        StringBuilder aux = new StringBuilder(name).append(": $")
                .append(price).append(" = $").append(getPrice(amount));
        return aux.toString();
    }
}
