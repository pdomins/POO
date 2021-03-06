package ar.itba.edu.POO.RepasoSegundoParcial.Otros.MultiMap;

public class MultiMapTester {
    public static void main(String[] args){
        MultiMap<String, Integer> m = new MultiMapImpl<>(Integer::compareTo);
        m.put("hola", 4);
        m.put("hola",2);
        m.put("hola",3);
        m.put("chau",4);
        m.put("chau",5);
        m.put("adios",6);
        System.out.println(m.size());
        System.out.println(m.get("hola"));
        System.out.println(m.getReverseOrder("hola"));
        m.remove("adios");
        m.remove("hola", 2);
        System.out.println(m.get("hola"));
        System.out.println(m.getReverseOrder("hola"));
        System.out.println(m.get("adios"));
        System.out.println(m.getReverseOrder("adios"));

        System.out.println(m.size());

    }
}
