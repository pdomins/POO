package ar.itba.edu.POO.SegundoParcial.TP7.P7;

import java.util.Map;

public class SortedMapTester {
    public static void main(String[] args){
        SortedMap<MyComparableClass, String> sm = new SortedMapImpl<>();
        MyComparableClass obj1 = new MyComparableClass("A");
        MyComparableClass obj2 = new MyComparableClass("B");
        MyComparableClass obj3 = new MyComparableClass("C");
        MyComparableClass obj4 = new MyComparableClass("D");
        obj1.sortableIdentifier = "Key 1";
        obj2.sortableIdentifier = "Key 2";
        obj3.sortableIdentifier = "Key 3";
        obj4.sortableIdentifier = "Key 4";
        sm.put(obj1, "Value 1");
        sm.put(obj2, "Value 2");
        sm.put(obj3, "Value 3");
        sm.put(obj4, "Value 4");
        System.out.println("--------------");
        for (Map.Entry<MyComparableClass,String> each : sm){
            System.out.println(each.getKey());
        }
        System.out.println("--------------");
        System.out.println(sm.higherKey());
        System.out.println(sm.higherValue());

        sm.remove(obj1);
        sm.remove(obj2);
        sm.remove(obj3);
        sm.remove(obj4);
        obj1.sortableIdentifier = "Key 4";
        obj2.sortableIdentifier = "Key 3";
        obj3.sortableIdentifier = "Key 2";
        obj4.sortableIdentifier = "Key 1";
        sm.put(obj1, "Value 1");
        sm.put(obj2, "Value 2");
        sm.put(obj3, "Value 3");
        sm.put(obj4, "Value 4");
        System.out.println("--------------");
        for (Map.Entry<MyComparableClass,String> each : sm){
            System.out.println(each.getKey());
        }
        System.out.println("--------------");
        System.out.println(sm.higherKey());
        System.out.println(sm.higherValue());
    }
}
