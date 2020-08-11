package ar.itba.edu.POO.PrimerParcial.TP5.P10;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTester {
    public static void main(String[] args){
        Integer[] intArray = new Integer[]{7,3,1,5,9};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        Pair<String,String> stringPair1 = new Pair<>("hola","mundo");
        Pair<String,String> stringPair2 = new Pair<>("hola","adios");
        Pair<String,String> stringPair3 = new Pair<>("buen","dia");
        Pair<String,String> pairArray[] = new Pair[]{stringPair1,stringPair2,stringPair3};
        Arrays.sort(pairArray);
        System.out.println(Arrays.toString(pairArray));
        Arrays.sort(pairArray, Comparator.reverseOrder());
        System.out.println(Arrays.toString(pairArray));


    /* Arrays.sort(intArray, new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
             return o2.compareTo(o1);
         }
     });
     */
    //Metodo Opcional 1
    //Arrays.sort(intArray, Comparator.reverseOrder());
        //Metodo Opcional 2
        Arrays.sort(intArray, (o1,o2)->o2.compareTo(o1));
     System.out.println(Arrays.toString(intArray));


    }
}
