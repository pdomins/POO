package ar.itba.edu.POO.PrimerParcial.TP4.P13;

public class Ej2 {
    public static void main(String[] args) {
        Ej2 ej2 = new Ej2();
        try {
            try{
                ej2.m3();
            }catch (Exception3 e){
                System.out.println("Excepcion 3 capturada");
            }finally{
                System.out.println("Finalizando 3");
            }
        }catch (Exception2 e){
            System.out.println("Excepcion 2 capturada");
        }finally {
            System.out.println("Finalizando 2");
        }
        try{
            ej2.m1();
        }catch (Exception4 e){
            System.out.println("Excepcion 4 capturada");
        }
    }
    public void m1(){
        throw new Exception4();
    }
    public void m2() throws Exception4{
        throw new Exception4();
    }
    public void m3() throws Exception2{
        throw new Exception3();
    }
}
