package ar.itba.edu.POO.SegundoParcial.TP6.Ej8;

public class BagTester {
    public static void main(String[] args){
        Bag<String> bag = new BagImpl<>();
        bag.add("Hola");
        bag.add("Hola");
        System.out.println(bag.count("Hola"));
        bag.add("Chau");
        System.out.println(bag.size());
        System.out.println(bag.sizeDistinct());
        System.out.println(bag.contains("Chau"));
        bag.remove("Hola");
        System.out.println(bag.count("Hola"));
        bag.remove("Hola");
        System.out.println(bag.contains("Hola"));
        bag.remove("Hola");



    }
}
