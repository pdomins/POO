package ar.itba.edu.Taller.T4;

public class IntegerListTester {

    public static void main(String[] args) {
        IntegerList<String> integerList = new ArrayIntegerList<>();
        System.out.println(integerList.isEmpty()); // true
        integerList.add("hola");
        integerList.add("hello");
        integerList.add("hei");
        integerList.add("hallo");
        System.out.println(integerList.contains("hei")); // 2
        System.out.println(integerList.remove(2)); // true
        System.out.println(integerList.contains("bye")); // -1
        System.out.println(integerList.removeElement("hallo"));
    }

}
