package ar.itba.edu.POO.RepasoSegundoParcial.Otros.SimpleList;

public class SimpleListTester {
    public static void main(String[] args){
        SimpleList<Integer> simpleList = new SimpleArrayList<>();
        simpleList.add(1);
        simpleList.add(3);
        simpleList.add(5);
        simpleList.add(7);

        System.out.println(simpleList.size());
        System.out.println(simpleList.contains(0));
        Integer sum = simpleList.reduce(0, (accum,value)->accum+value);
        System.out.println(sum);
        String s = simpleList.reduce("",(accum,value)-> accum + String.format("<%d>",value));
        System.out.println(s);

    }
}
