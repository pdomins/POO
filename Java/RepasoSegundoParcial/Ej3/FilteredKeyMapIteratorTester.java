package ar.itba.edu.POO.RepasoSegundoParcial.Ej3;

import java.util.HashMap;
import java.util.Map;

public class FilteredKeyMapIteratorTester {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

       FilteredKeyMapIterator<Integer, String> mapIterator =
                new FilteredKeyMapIterator<>(map,k-> k % 2==1);

       while(mapIterator.hasNext()){
           System.out.println("Key "+ mapIterator.next());
           System.out.println("Value "+mapIterator.getValue());
       }
       mapIterator = new FilteredKeyMapIterator<>(map, k -> k != null);
       try{
           mapIterator.getValue();
       }catch (Exception ex){
           System.out.println(ex.getClass());
       }
       System.out.println(mapIterator.next());
       System.out.println(mapIterator.getValue());
       System.out.println(mapIterator.getValue());
        while(mapIterator.hasNext()){
            mapIterator.next();
        }
        mapIterator.next();
    }
}
