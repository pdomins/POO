package ar.itba.edu.Parciales.PrimerParcial.Varios;

public enum Toppings {
    CEBOLLA("cebolla",10),
    TOMATE("tomate",30),
    QUESO("extra queso",20);

    private String name;
    private int price;

    Toppings(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
