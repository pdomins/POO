package ar.itba.edu.POO.PrimerParcial.TP4.P7;

public class Interval implements IntervalCondition{
    double start;
    double end;
    double increment;
    long counter;

    public Interval(double start, double end, double increment) {
      if (start > end || increment <=0) {
          throw new IllegalArgumentException("Invalid Arguments entered");
      }
        this.start = start;
        this.end = end;
        this.increment = increment;
    }

    public Interval(double start, double end) {
        if (start > end) {
            throw new IllegalArgumentException("Invalid Arguments entered");
        }
        this.start = start;
        this.end = end;
        this.increment = 1.0;
    }
    public long size(){
        return (long)((this.end-this.start)/this.increment);
    }

    double at(long index){
        double a = (index*increment)+start;
        if ( a > this.end) {
            throw new IllegalArgumentException("Invalid Arguments entered");
        }
        return a;

    }
    long indexOf(double valor){
        double a = (valor-start)/increment;
        if (valor == at((long) a))
            return (long)a;
        return 0;
    }
    boolean includes(double valor){
        return indexOf(valor) != 0;
    }
    @Override
    public String toString(){
        return String.format("The Interval starts at %f.2 ends at %.2f and increments by %.2f",this.start,this.end, this.increment);
    }
    //@Override PREGUNTAR BIEN COMO HACER EL EQUALS
    //public boolean equals(Object o){
     //   if (this == o){
     //       return true;
      //  }
      //  if (o == null || ! (o instanceof Interval) ){
       //     return false;
       // }
        //return false;
    //}
    private void resetCount(){
        this.counter = 0;
    }
    private void count(){
        this.counter++;
    }
    @Override
    public long isEven() {
        resetCount();
        for (double i  = this.start; i < this.end; i += this.increment){ //muy imperativo, hay una forma mas oop??
            if (i % 2 == 0)
                count();
        }
        return this.counter;
    }
}