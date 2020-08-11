package ar.itba.edu.POO.PrimerParcial.TP3.ej9;

public class Triangle extends Figure{
    Point firstPoint;
    Point secondPoint;
    Point thirdPoint;
    double A,B,C;
    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
        this.firstPoint=firstPoint;
        this.secondPoint=secondPoint;
        this.thirdPoint=thirdPoint;

    }
    private void getSides() {
         A = firstPoint.distanceTo(secondPoint);
         B = firstPoint.distanceTo(thirdPoint);
         C = secondPoint.distanceTo(thirdPoint);
    }

    double area(){
        getSides();
        double S = (A+B+C)/2;
    return Math.sqrt(S*(S-A)*(S-A)*(S-C));
    }

    double perimeter(){
    return A+B+C;
    }
    @Override
    public String toString(){
        return String.format("Triangle [%s ,%s, %s]", firstPoint,secondPoint,thirdPoint);
    }
}