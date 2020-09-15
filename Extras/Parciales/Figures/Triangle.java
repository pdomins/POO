package ar.itba.edu.Parciales.Figures;

public class Triangle extends Figure {
    Point firstPoint;
    Point secondPoint;
    Point thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }
    private double firstSide(){
            return firstPoint.distanceTo(secondPoint);
    }
    private double secondSide(){
            return secondPoint.distanceTo(thirdPoint);
    }
    private double thirdSide(){
            return thirdPoint.distanceTo(firstPoint);
    }

    @Override
    double area(){
        //heron formula
    double semiperimeter = perimeter()/2;
    return Math.sqrt(semiperimeter*(semiperimeter-firstSide())
        *(semiperimeter-secondSide())*(semiperimeter-thirdSide()));
}
    @Override
    double perimeter() {
        return firstSide()+secondSide()+thirdSide();
    }

    @Override
    public String toString() {
        return String.format("Triangulo [ %s, %s, %s]",firstPoint,secondPoint,thirdPoint);
    }

}
