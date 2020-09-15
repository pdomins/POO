package ar.itba.edu.PrimerParcial.P3;

public enum Toppings {
    EXTRAQUESO("extra queso", 20),
    CEBOLLA("cebolla",10),
    TOMATE("tomate",30);

    String string;
    int price;

    Toppings(String string, int price) {
        this.string = string;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public String toString(){
        return string;
    }
}
