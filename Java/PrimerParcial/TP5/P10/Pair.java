package ar.itba.edu.POO.PrimerParcial.TP5.P10;

public class Pair<T extends Comparable <? super T>,
                    P extends Comparable <? super P>>
                        implements Comparable<Pair<T,P>> {
    public T obj1;
    public P obj2;

    public Pair(T obj1, P obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "[" + obj1 +", "+ obj2 + ']';
    }

    @Override
    public int compareTo(Pair<T,P> pair) {
        int cmp = obj1.compareTo(pair.obj1);
        if (cmp == 0){
            cmp = obj2.compareTo(pair.obj2);
        }
        return cmp;

    }
}
