package ar.itba.edu.Parciales.Figures;

public class Circle extends Ellipse {
    public Circle(Point centerPoint, double radius) {
        super(centerPoint, 2*radius, 2*radius);
    }

    @Override
    public String toString() {
        return String.format("Circle[Centro: %s, Radio: %.2f]",centerPoint,sMayorAxis/2);
    }
}
