package ar.itba.edu.POO.SegundoParcial.TP7.P9;

public class ChangeCashier extends Cashier {

    public ChangeCashier(NoteDispenser dispenser) {
        super(dispenser);
    }

    @Override
    public void getMoney(Integer amount){
        int i = values.length-1;
        int totalAmount = amount;
        int change = 0;
        while (amount!=0){
            if (amount >= values[i] && getMoney(1,values[i])>0){
                amount-=values[i];
                change++;
            }
            i--;
            if (i<0){
                if (change ==0){
                    getDispenser().reset();
                    super.getMoney(totalAmount);
                    return;
                }else{
                    change =0;
                    i = values.length-1;
                }
            }
        }
        getDispenser().deliver();
    }
}
