package ar.itba.edu.POO.RepasoSegundoParcial.Ej1;

import java.util.Map;

public class SimpleListTester {
    public static void main(String[] args){
        SimpleList<Integer> simpleList = new SimpleArrayList<>();
        simpleList.add(1);
        simpleList.add(3);
        simpleList.add(5);
        simpleList.add(7);

        System.out.println(simpleList.size());
        System.out.println(simpleList.contains(0));
        System.out.println("-------------------------");

        Map<Integer, Integer> first = simpleList.toMap((element)-> element * 2);
        System.out.println(first.get(2));
        System.out.println(first.get(6));
        System.out.println(first.get(10));
        System.out.println(first.get(14));

        System.out.println("-------------------------");

        Map<String, Integer> second = simpleList.toMap((element)->String.format("<%d>",element));
        System.out.println(second.get("<1>"));
        System.out.println(second.get("<3>"));
        System.out.println(second.get("<5>"));
        System.out.println(second.get("<7>"));

        System.out.println("-------------------------");

        Map<Integer, Integer> third = simpleList.toMap(element->element%2);
        System.out.println(third.get(0));
        System.out.println(third.get(1));

    }
}
