package ar.itba.edu.POO.PrimerParcial.Taller.subway;

public class RechargeableSubwayCard extends SubwayCard {

    private double balance;

    public RechargeableSubwayCard(SubwayCentral subwayCentral) {
        super(subwayCentral);
    }

    public void recharge(double amount) {
        balance += amount;
    }

    protected double rideCost() {
        return subwayCentral.getRideCost();
    }

    @Override
    protected boolean canRide() {
        return balance >= rideCost();
    }

    @Override
    public void ride() {
        if(!canRide()) {
            System.err.println("No more trips.");
        }
        balance -= rideCost();
    }

}