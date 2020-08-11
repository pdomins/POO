package ar.itba.edu.POO.PrimerParcial.Taller.GenericsList;

public class IntegerListTest {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        System.out.println(List.isEmpty()); // true
        List.add(1);
        List.add(4);
        List.add(3);
        List.add(5);
        System.out.println(List.contains(3)); // 2
        System.out.println(List.remove(2)); // true
        System.out.println(List.contains(3)); // -1
        System.out.println(List.removeElement(1));
    }
}
