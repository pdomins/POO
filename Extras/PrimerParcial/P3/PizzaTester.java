package ar.itba.edu.PrimerParcial.P3;

public class PizzaTester {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza(PizzaType.valueOf("PARRILLA"), new Toppings[]{Toppings.valueOf("TOMATE")});
        System.out.println(pizza1);
        Pizza pizza2 = new Pizza(PizzaType.valueOf("PARRILLA"), new Toppings[]{Toppings.valueOf("TOMATE"),Toppings.valueOf("CEBOLLA"),Toppings.valueOf("EXTRAQUESO")});
        System.out.println(pizza2);
        Pizza pizza3 = new Pizza(PizzaType.valueOf("HORNO"), new Toppings[]{Toppings.valueOf("CEBOLLA"),Toppings.valueOf("EXTRAQUESO")});
        System.out.println(pizza3);
    }
}
