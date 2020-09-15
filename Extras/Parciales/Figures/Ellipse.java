package ar.itba.edu.Parciales.Figures;

public class Ellipse extends Figure {
    protected final Point centerPoint;
    protected final double sMayorAxis, sMinorAxis;

    public Ellipse(Point centerPoint, double sMayorAxis, double sMinorAxis) {
        this.centerPoint = centerPoint;
        this.sMayorAxis = sMayorAxis;
        this.sMinorAxis = sMinorAxis;
    }

    @Override
    double area() {
        return Math.PI/4*sMayorAxis*sMinorAxis;
    }

    @Override
    double perimeter() {
        return Math.PI*(sMinorAxis+sMayorAxis);
    }

    @Override
    public String toString() {
        return String.format("Ellipse[Centro %s, DMayor %.2f, DMenor %.2f]",centerPoint,sMayorAxis,sMinorAxis);
    }
}
