package ar.itba.edu.TP4.P7;

import ar.itba.edu.TP5.P13.IntervalIterator;

import java.util.Iterator;
import java.util.Objects;

public class Interval implements Iterable<Double> {
    double start, end, increment;

    public Interval(double start, double end, double increment) {
        if (Math.abs(increment)<Double.MIN_VALUE)
            throw new IllegalArgumentException("Incremento no puede ser 0");
        this.start = start;
        this.end = end;
        this.increment = increment;
        if (size() == 0 )
            throw new IllegalArgumentException("Intervalo vacio");
    }

    public Interval(double start, double end) {
        this(start,end,1);
    }
    long size(){
        return Math.max(0, (int)((end-start)/increment +1));
    }

    double at (long index){
        double ans = start+increment*index;
        if (ans < 0){
            throw new IllegalArgumentException("Out of boundaries");
        }
        if ((increment < 0 && end <= ans && ans <= start )
                || ( increment > 0 && start <= ans && ans <= end )){
            return ans;
        }
        throw new IllegalArgumentException("Out of boundaries");
    }
    public long indexOf(double valor){
        double inicio, fin,incremento;
        if (start <= end){
            inicio = start;
            fin = end;
            incremento = increment;
        }else{
            inicio=end;
            fin=start;
            incremento=-increment;
        }
        for (double rec =inicio; rec <= fin; rec +=incremento){
            if (Math.abs(rec-valor) < epsilon(valor)){
                return Math.round((rec-start)/increment);
            }
        }
        return -1;
    }
    public int count(IntervalCondition condition){
        int ans = 0;
        double st, ed, inc;
        if (start <= end){
            st=start;
            ed=end;
            inc=increment;
        }else{
            st =end;
            ed=start;
            inc=-increment;
        }
        for (double rec = st; rec <= ed; rec += inc){
            if (condition.satisfies(rec)){
                ans++;
        }}
        return ans;
    }

    boolean includes(double valor){
        return indexOf(valor)!= -1;
    }

    private double epsilon(double nro) {
        return Math.pow(2,-52+(int) Math.log(Math.abs(nro))/Math.log(2));
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder("[");
        double rec;
        if (start <= end){
            for (rec = start; rec <= end; rec+=increment){
                aux.append(String.valueOf(rec)).append(",");
            }
        }else{
            for (rec = start; rec >= end; rec+=increment){
                aux.append(String.valueOf(rec)).append(",");
            }
        }
        return aux.substring(0,aux.length()-1)+"]";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        if (Double.compare(interval.start, start) != 0)
            return false;
        if(Double.compare(interval.end, end) != 0 )
            return false;
        return Double.compare(interval.increment, increment) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, increment);
    }

    @Override
    public Iterator<Double> iterator() {
        return new IntervalIterator(start,end,increment);
    }
}
