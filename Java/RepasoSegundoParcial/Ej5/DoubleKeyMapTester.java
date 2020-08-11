package ar.itba.edu.POO.RepasoSegundoParcial.Ej5;

public class DoubleKeyMapTester {
    public static void main(String[] args){
        DoubleKeyMap<String, String, Integer> doubleKeyMap = new DoubleKeyHashMap<>();
        doubleKeyMap.put("Juan","Perez",49);
        System.out.println(doubleKeyMap.size());
        doubleKeyMap.put("Lucas","Gomez",37);
        doubleKeyMap.put("Lucas","Lopez",26);
        doubleKeyMap.put("Juan","Lopez",55);
        System.out.println(doubleKeyMap.size());
        System.out.println(doubleKeyMap.isEmpty());
        System.out.println(doubleKeyMap.containsKey("Juan","Ramirez"));
        System.out.println(doubleKeyMap.containsKey("Juan","Gomez"));
        System.out.println(doubleKeyMap.containsKey("Lucas","Gomez"));
        System.out.println(doubleKeyMap.get("Lucas","Gomez"));
        System.out.println(doubleKeyMap.get("Lucas","Lopez"));
        System.out.println(doubleKeyMap.containsValue(26));
        doubleKeyMap.put("Lucas","Lopez",27);
        System.out.println(doubleKeyMap.size());
        System.out.println(doubleKeyMap.containsValue(26));
        System.out.println(doubleKeyMap.get("Lucas","Lopez"));
        System.out.println(doubleKeyMap.containsKey("Gomez","Lucas"));
        System.out.println(doubleKeyMap.containsValue(10));







    }
}
