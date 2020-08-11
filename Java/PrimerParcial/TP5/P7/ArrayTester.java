package ar.itba.edu.POO.PrimerParcial.TP5.P7;

import java.util.Arrays;

public class ArrayTester {
    public static void main(String[] args){
        Integer[] intArray = new Integer[]{7,3,1,5,9};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

    }
}
