package ar.itba.edu.Parciales.Figures;

public class Rectangle extends Figure {
    Point topLeft;
    Point bottomRight;

    @Override
    public String toString() {
        return String.format("Rectangulo [%s, %s]",topLeft,bottomRight);
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double base(){
        return Math.abs(topLeft.getX()-bottomRight.getX());
    }
    public double height(){
        return Math.abs(topLeft.getY()-bottomRight.getY());
    }

    @Override
    double area() {
        return base()*height();
    }

    @Override
    double perimeter() {
        return base()*2+height()*2;
    }

    boolean belongs(Point point) {
        double x = point.getX();
        double y = point.getY();
        return x > topLeft.getX() && x < bottomRight.getX()
                && y > bottomRight.getY() && y < topLeft.getY();
    }
}
