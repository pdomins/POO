package ar.itba.edu.POO.PrimerParcial.TP4.P3;

import ar.itba.edu.POO.PrimerParcial.TP3.ej9.Ellipse;

public class MovableEllipse extends Ellipse implements MovableFigure {

    public MovableEllipse(MovablePoint centerPoint, double sMayorAxis, double sMinorAxis) {
        super(centerPoint, sMayorAxis, sMinorAxis);
    }

    @Override
    public MovablePoint[] getPoints() {
        MovablePoint[] movablePoints = new MovablePoint[1];
        movablePoints[0] = (MovablePoint) centerPoint;
        return movablePoints;
    }

}
