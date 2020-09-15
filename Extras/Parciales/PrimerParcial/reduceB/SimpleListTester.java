package ar.itba.edu.Parciales.PrimerParcial.reduceB;


public class SimpleListTester {
   public static void main(String[] args){
       SimpleList<Integer> simpleList = new SimpleArrayList<>();
       simpleList.add(1);
       simpleList.add(3);
       simpleList.add(5);
       simpleList.add(7);

       System.out.println(simpleList.size());

       System.out.println(simpleList.contains(0));
       Integer sum = simpleList.reduce(0, (o1, o2) -> o1 + o2);
       System.out.println(sum);

       SimpleList<Integer> emptyList = new SimpleArrayList<>();
       Integer emptySum = emptyList.reduce(0, (o1,o2)->o1+o2);
       System.out.println(emptySum);

       Integer prod = simpleList.reduce(1, (o1,o2)->o1*o2);
       System.out.println(prod);

       Integer emptyProd = emptyList.reduce(1, (o1,o2)->o1*o2);
       System.out.println(emptyProd);


      // String s = simpleList.reduce( "", (accum,value)-> accum + String.format("<%d>",value));
       //       System.out.println(s);

       // String t = emptyList.reduce(".",(accum, value)-> accum + String.format("<%d>",value));
       // System.out.println(t);


   }
}
