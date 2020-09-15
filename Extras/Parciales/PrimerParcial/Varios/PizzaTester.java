package ar.itba.edu.Parciales.PrimerParcial.Varios;


public class PizzaTester {
    public static void main(String[] args){
        Pizza pizza1= new Pizza(PizzaType.valueOf("PARRILLA"), new Toppings[]{Toppings.valueOf("TOMATE")});
        System.out.println(pizza1);
        Pizza pizza2= new Pizza(PizzaType.valueOf("PARRILLA"), new Toppings[]{Toppings.valueOf("TOMATE"),Toppings.valueOf("CEBOLLA"),Toppings.valueOf("QUESO")});
        System.out.println(pizza2);
        Pizza pizza3= new Pizza(PizzaType.valueOf("HORNO"), new Toppings[]{Toppings.valueOf("CEBOLLA"),Toppings.valueOf("QUESO")});
        System.out.println(pizza3);
    }
}
