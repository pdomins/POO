package ar.itba.edu.POO.PrimerParcial.TP4.P13;

public class Ej1{
    public static void main(String[] args) {
        Ej1 ej1 = new Ej1();
        try {
            ej1.method();
            System.out.println("Metodo ejecutado");
        } catch (Exception e) {
            System.out.println("Exception 2 capturada");
        } finally {
            System.out.println("Finalizado");
        }
    }
    public void method() throws Exception3 {
        throw new Exception3();
    }
}