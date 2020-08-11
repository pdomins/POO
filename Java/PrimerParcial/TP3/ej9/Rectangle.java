package ar.itba.edu.POO.PrimerParcial.TP3.ej9;

public class Rectangle extends Figure{
    Point topLeft;
    Point bottomRight;
    public Rectangle(Point topLeft, Point bottomRight) {
        this.bottomRight=bottomRight;
        this.topLeft=topLeft;
    }
    double base(){
        return bottomRight.getX()-topLeft.getX();
    }
    double height(){
        return bottomRight.getY()-topLeft.getY();
    }
    double area(){
        return base()*height();
    }
    double perimeter(){
        return 2*base()+2*height();
    }
    @Override
    public String toString(){
        return String.format("Rectangle [%s ,%s]", topLeft,bottomRight);
    }

}