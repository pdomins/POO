package ar.itba.edu.POO.PrimerParcial.P3;

public enum Toppings {
    EXTRAQUESO("extra queso",20),
    TOMATE("tomate",30),
    CEBOLLA("cebolla",10);

    String topping;
    int price;

     Toppings(String topping, int price){
        this.topping=topping;
        this.price=price;
    }

    public String getTopping() {
        return topping;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return topping;
    }
}
