package ar.itba.edu.POO.SegundoParcial.TP6.Ej3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairCyclicIteratorTester {
    public static void main(String[] args){
        List<String> list = Arrays.asList("hola","que","tal","todo","bien");
        PairCyclicIterator<String> listIterator = new PairCyclicIterator<>(list);
        for (int i = 0 ; listIterator.hasNext() && i < 5; i ++){
            System.out.println(listIterator.next());
        }
        System.out.println("-------------------------");
        Set<Integer> set = new HashSet<>();
        PairCyclicIterator<Integer> setIterator = new PairCyclicIterator<>(set);
        System.out.println(setIterator.hasNext());
        setIterator.next();

    }
}
