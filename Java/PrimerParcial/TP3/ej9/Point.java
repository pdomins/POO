package ar.itba.edu.POO.PrimerParcial.TP3.ej9;

public class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distanceTo(Point point){
        return Math.sqrt(Math.pow(point.getX()-x,2)+(Math.pow(point.getY()-y,2)));
    }

    @Override
    public String toString() {
        return String.format("{%g, %g}", x, y);
    }
}