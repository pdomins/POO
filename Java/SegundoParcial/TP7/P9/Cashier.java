package ar.itba.edu.POO.SegundoParcial.TP7.P9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cashier {
    private NoteDispenser dispenser;
    public static Integer[] values = {100,50,20,10,5,2,1};
    private Map<Integer, Integer> cash = new HashMap<>();

    public Cashier(NoteDispenser dispenser) {
        this.dispenser = dispenser;
        this.dispenser.setCashier(this);
        for (Integer i : values){
            cash.put(i,0);
        }
    }

    public void getMoney(Integer amount){
        int i = 0;
        while (amount != 0 && i < values.length){
            if (amount >= values[i]){
                int neededCount = amount / values[i];
                int realCount = getMoney(neededCount, values[i]);
                amount -= realCount*values[i];
            }
            i++;
        }
        if (amount != 0){
            dispenser.reset();
            throw new NoCashException();
        }
        dispenser.deliver();
    }
    protected Integer getMoney(Integer count, Integer value){
        int realCount = cash.get(value);
        if (realCount < count ){
            count = realCount;
        }
        if (count > 0){
            cash.put(value, realCount-count);
            dispenser.storeNote(count, value);
        }
        return count;
    }
    public void loadMoney(List<Integer> newCash){
        for (Integer i : newCash){
            cash.put(i, cash.get(i)+1);
        }
    }
    public NoteDispenser getDispenser(){
        return dispenser;
    }
}
