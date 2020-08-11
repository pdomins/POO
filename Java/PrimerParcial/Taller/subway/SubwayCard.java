package ar.itba.edu.POO.PrimerParcial.Taller.subway;

public abstract class SubwayCard {

    protected SubwayCentral subwayCentral;

    public SubwayCard(SubwayCentral subwayCentral) {
        this.subwayCentral = subwayCentral;
    }

    protected abstract boolean canRide();

    public abstract void ride();

}