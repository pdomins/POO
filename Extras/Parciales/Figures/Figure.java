package ar.itba.edu.Parciales.Figures;

public abstract class Figure implements Comparable<Figure> {
    abstract double area();
    abstract double perimeter();
   // abstract boolean belongs (Point point);

    //ordeno por primero tamaño de area y luego del perimetro
    //ordenamiento "natural"
    @Override
   public int compareTo(Figure figure) {
       int cmp = Double.compare(this.area(),figure.area());
       if (cmp == 0){
           cmp = Double.compare(this.perimeter(), figure.perimeter());
       }
       return cmp;
   }

}
