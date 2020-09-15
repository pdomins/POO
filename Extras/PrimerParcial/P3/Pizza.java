package ar.itba.edu.PrimerParcial.P3;

public class Pizza {
    PizzaType pizza;
    Toppings[] toppings;

    public Pizza(PizzaType pizza, Toppings[] toppings) {
        this.pizza = pizza;
        this.toppings = toppings;
    }
    public String toString(){
        int price;
        StringBuilder aux = new StringBuilder("Pizza ");
        aux.append(pizza);
        price = pizza.getPrice();
        for (Toppings toppings : toppings){
            aux.append(" con ").append(toppings);
            price+= toppings.getPrice();
        }
        aux.append(" $").append(price);
        return aux.toString();
    }

}
