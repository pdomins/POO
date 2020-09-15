package ar.itba.edu.Parciales.PrimerParcial.Varios;

public class Pizza {
    PizzaType base;
    Toppings[] toppings;


    public Pizza(PizzaType base, Toppings[] toppings) {
        this.base=base;
        this.toppings=toppings;
    }
    public String toString(){
        int price = base.getPrice();
        StringBuilder aux = new StringBuilder("Pizza ");
        aux.append(base);
        for (Toppings toppings : toppings){
            aux.append(" con ").append(toppings);
            price+=toppings.getPrice();
        }
        aux.append(": $").append(price);
        return aux.toString();
    }
}
