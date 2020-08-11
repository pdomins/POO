package ar.itba.edu.POO.SegundoParcial.TP7.P9;


import java.util.ArrayList;
import java.util.List;

public class NoteDispenser {
    private Cashier cashier;
    private List<Integer> notes = new ArrayList<>();

    public void reset(){
        cashier.loadMoney(notes);
        notes = new ArrayList<>();
    }
    public void storeNote(Integer count, Integer value){
        for (int i = 0 ; i < count; i++){
            notes.add(value);
        }
    }
    public void deliver(){
        for (Integer i : notes){
            System.out.println("Billete de "+ i);
        }
    }
    public void setCashier(Cashier cashier){
        this.cashier=cashier;
    }

}
