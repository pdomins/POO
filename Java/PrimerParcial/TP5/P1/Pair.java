package ar.itba.edu.POO.PrimerParcial.TP5.P1;

public class Pair<F, S> {

    private F first; //first member of pair
    private S second; //second member of pair

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString(){
        return first+"/"+second;
    }
    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Pair))
            return false;
        Pair<?,?> aux = (Pair<?,?>) o;
        if (!this.first.equals(aux.first))
            return false;
        return this.second.equals(aux.second);

    }
}