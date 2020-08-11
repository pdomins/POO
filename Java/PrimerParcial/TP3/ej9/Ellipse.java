package ar.itba.edu.POO.PrimerParcial.TP3.ej9;

public class Ellipse extends Figure {
    public Point centerPoint;
    public double sMayorAxis;
    public double sMinorAxis;
    double r1,r2;

    public Ellipse(Point centerPoint,double sMayorAxis,double sMinorAxis){
        this.centerPoint=centerPoint;
        this.sMayorAxis=sMayorAxis;
        this.sMinorAxis=sMinorAxis;
        this.r1= sMayorAxis/2;
        this.r2=sMinorAxis/2;
    }
    double area(){
    return Math.PI*r1*r2;
  }
  double perimeter(){
        return Math.PI*2*Math.sqrt((Math.pow(r1,2)+Math.pow(r2,2))/2);
  }
    @Override
    public String toString(){
        return String.format("Ellipse [Center = %s , Mayor Axis = %.2f,Minor Axis =  %.2f]", centerPoint,sMayorAxis,sMinorAxis);
    }
}