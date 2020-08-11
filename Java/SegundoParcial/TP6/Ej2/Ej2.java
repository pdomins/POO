package ar.itba.edu.POO.SegundoParcial.TP6.Ej2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println(Arrays.toString(list.toArray()));
        list.removeIf((x)-> x % 2 == 0);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
