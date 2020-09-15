package ar.itba.edu.PrimerParcial.P2;

public class ParallelIteratorTester {
    public static void main(String[] args){
        String[] v1 = new String[]{"hola","mundo","adios"};
        String[] v2 = new String[]{"hello","world"};

        ParallelIterator<String> myIterator = new ParallelIterator<>(v1,v2);
        System.out.println(myIterator.next());
        System.out.println(myIterator.next());
        try{
            System.out.println(myIterator.next());
        }catch (Exception ex){
            System.out.println(ex.getClass());
        }
        System.out.println("--------------");
        try{
            new ParallelIterator<>(null,v2);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("--------------");
        try{
            new ParallelIterator<>(v1,null);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
