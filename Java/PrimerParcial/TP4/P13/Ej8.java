package ar.itba.edu.POO.PrimerParcial.TP4.P13;

public class Ej8 {
    public static void main(String[] args){
        Ej8 ej8 = new Ej8();
        try{
            try{
                ej8.method();
            }catch (Exception3 e){
                ej8.method();
                System.out.println("Excepcion 3 capturada");
            }finally{
                System.out.println("Finalizando 3");
            }
        }catch (Exception2 e){
            System.out.println("Excepcion2 capturada");
        }finally {
            System.out.println("finalizando 2");
        }
    }
    public void method()throws Exception2{
        throw new Exception3();
    }
}