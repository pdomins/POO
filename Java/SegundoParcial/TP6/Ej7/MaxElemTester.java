package ar.itba.edu.POO.SegundoParcial.TP6.Ej7;

import java.util.ArrayList;
import java.util.List;

public class MaxElemTester {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            myList.add(i);
        }
        for (Integer i: myList)
            System.out.println(i);
        Integer max = MaxElemClass.getMaxElem(myList);
    }
}
