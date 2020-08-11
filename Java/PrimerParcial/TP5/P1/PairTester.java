package ar.itba.edu.POO.PrimerParcial.TP5.P1;

public class PairTester{
    public static void main(String[] args){
        Pair<String,Double> stringDoublePair = new Pair<>("hola",0.1);
        System.out.println(stringDoublePair);
        Pair<Integer,Integer> integerIntegerPair = new Pair<>(1,2);
        System.out.println(integerIntegerPair);
        System.out.println(stringDoublePair.equals(new Pair<>("hola",0.1)));

        Pair otherPair = new Pair(1f,"mundo");
        System.out.println(otherPair);
    }
}