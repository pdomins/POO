package ar.itba.edu.POO.SegundoParcial.TP7.P5;

public class IterableBagTester {
    public static void main(String[] args){
        IterableBag<String> stringBag = new IterableBagImpl<>();
        System.out.println(stringBag.contains("hola"));
        stringBag.add("hola");
        System.out.println(stringBag.contains("hola"));
        stringBag.add("que");
        stringBag.add("que");
        System.out.println(stringBag.count("que"));
        stringBag.add("tal");
        System.out.println(stringBag.count("que"));
        System.out.println(stringBag.sizeDistinct());
        for (String elem: stringBag.elementsDistinct()){
            System.out.println(elem);
        }
        System.out.println(stringBag.size());
        for (String elem: stringBag.elements()){
            System.out.println(elem);
        }
        stringBag.remove("tal");
        System.out.println(stringBag.sizeDistinct());
        System.out.println("-----------");
        IterableBag<Integer> integerBag = new IterableBagImpl<>();
        integerBag.remove(2);
    }
}
