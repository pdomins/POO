package ar.itba.edu.POO.PrimerParcial.P3;

public enum PizzaType {
    HORNO("Pizza al horno",100),
    PARILLA("Pizza a la parrilla",150);

    String pizzaType;
    int price;

    PizzaType(String pizzaType, int price) {
        this.pizzaType = pizzaType;
        this.price = price;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return pizzaType;
    }
}
