package ar.itba.edu.POO.PrimerParcial.TP3.ej9;

public class FigureTester {
    public static void main(String[] args){
        Rectangle myRectangle = new Rectangle(new Point(0,0), new Point(2,4));
        System.out.println(myRectangle);
        System.out.println(myRectangle.base());
        System.out.println(myRectangle.height());
        System.out.println(myRectangle.area());
        System.out.println(myRectangle.perimeter());

        Triangle myTriangle = new Triangle(new Point(0,0), new Point(1,0), new Point(0,1));
        System.out.println(myTriangle);
        System.out.println(String.format("%.2f",myTriangle.area()));
        System.out.println(myTriangle.perimeter());

        Ellipse myEllipse = new Ellipse(new Point(0,0), 2,1);
        System.out.println(myEllipse);
        System.out.println(myEllipse.perimeter());
        System.out.println(myEllipse.area());

        Circle myCircle = new Circle(new Point(0,0),3);
        System.out.println(myCircle);
        System.out.println(myCircle.perimeter());
        System.out.println(myCircle.area());



    }
}