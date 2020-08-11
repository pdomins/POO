package ar.itba.edu.POO.PrimerParcial.TP3.ej9;

public class Circle extends Ellipse {

    public Circle(Point centerPoint, double radius){
       super(centerPoint,2*radius,2*radius);
    }
    public String toString(){
        return String.format("Circle [Center = %s ,Radius = %.2f]", centerPoint,sMayorAxis/2);
    }

}