package ar.itba.edu.TP5.P7;
import ar.itba.edu.TP5.P1.Pair;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTester {
    public static void main(String[] args){
        Integer[] intArray = new Integer[]{7,3,1,5,9};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        Pair<String, String> StringPair1 = new Pair<>("hola","mundo");
        Pair<String, String> StringPair2 = new Pair<>("hola","adios");
        Pair<String, String> StringPair3 = new Pair<>("buen","dia");
        Pair[] pairArray = new Pair[]{StringPair1,StringPair2,StringPair3};
        Arrays.sort(pairArray);
        System.out.println(Arrays.toString(pairArray));
        Arrays.sort(pairArray,Comparator.reverseOrder());
        System.out.println(Arrays.toString(pairArray));
        Arrays.sort(pairArray);
        System.out.println(Arrays.toString(pairArray));
        //Arrays.sort(pairArray, (o1,o2)-> o2.compareTo(o1));
        //System.out.println(Arrays.toString(pairArray));
        /*
        Arrays.sort(pairArray, new Comparator<Pair>() {
            @Override
            public int compare(Pair pair, Pair t1) {
                int aux = t1.getA().compareTo(pair.getA());
                if (aux == 0){
                    aux= t1.getB().compareTo(pair.getB());
                }
                return aux;
            }
        });
         */
        Arrays.sort(pairArray, (o1,o2)->{
                    int cmp = o2.getA().compareTo(o1.getA());
                    if (cmp == 0){
                        cmp = o2.getB().compareTo(o1.getB());
                    }
                    return cmp;
        });
        System.out.println(Arrays.toString(pairArray));

       /* Arrays.sort(intArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer.compareTo(t1);
            }
        });
        */
       Arrays.sort(intArray, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray, (o1,o2)->o2.compareTo(o1));
        System.out.println(Arrays.toString(intArray));



    }
}
