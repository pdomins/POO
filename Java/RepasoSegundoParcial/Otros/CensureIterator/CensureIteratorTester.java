package ar.itba.edu.POO.RepasoSegundoParcial.Otros.CensureIterator;

import java.util.*;


public class CensureIteratorTester {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        CensureIterator<String> stringCensureIterator = new CensureIterator<>(strings, "XXXX");
        stringCensureIterator.censure("Two").censure("Four");
        iteratorPrinter(stringCensureIterator);

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("One", 1);
        stringIntegerMap.put("Two", 2);
        stringIntegerMap.put("Three", 3);
        stringCensureIterator = new CensureIterator<>(stringIntegerMap.keySet(), "XXXX");
        stringCensureIterator.censure("Two").censure("Four");
        iteratorPrinter(stringCensureIterator);

        Integer[] integers = new Integer[]{1, 2, 3};
        CensureIterator<Integer> integerCensureIterator = new CensureIterator<>(integers, -1);
        integerCensureIterator.censure(2).censure(4);
        iteratorPrinter(integerCensureIterator);
    }
        private static <T> void iteratorPrinter(Iterator<T> iterator){
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            System.out.println();
        }
    }
