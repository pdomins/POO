package ar.itba.edu.POO.PrimerParcial.Taller.subway;

public class FixedSubwayCard extends SubwayCard {
    private int rides;

    public FixedSubwayCard(SubwayCentral subwayCentral, int rides) {
        super(subwayCentral);
        this.rides = rides;
    }

    @Override
    protected boolean canRide() {
        return rides > 0;
    }

    @Override
    public void ride() {
        if(!canRide()) {
            System.err.println("No more trips.");
        }
        rides--;
    }
}
