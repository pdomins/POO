package ar.itba.edu.POO.PrimerParcial.P3;

public class Pizza {
    Toppings[] toppings;
    private PizzaType type;

    public Pizza(PizzaType pizzaType, Toppings[] toppings) {
        this.toppings = toppings;
        type = pizzaType;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder(type.getPizzaType());
        int price = type.getPrice();
        for (Toppings topping : toppings) {
            aux.append(" con ").append(topping);
            price += topping.getPrice();
        }
        aux.append(": $").append(price);
        return aux.toString();
    }
}
